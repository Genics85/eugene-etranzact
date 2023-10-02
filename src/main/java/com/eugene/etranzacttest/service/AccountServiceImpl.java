package com.eugene.etranzacttest.service;

import com.eugene.etranzacttest.exception.ResourceNotFoundException;
import com.eugene.etranzacttest.model.Account;
import com.eugene.etranzacttest.model.dto.UpdateAccountDto;
import com.eugene.etranzacttest.repo.AccountRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account create(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account update(Account account) {
        Account toBeUpdated =new Account();

        toBeUpdated.setBalance( account.getBalance());
        toBeUpdated.setType(account.getType());

        accountRepository.save(toBeUpdated);

        return toBeUpdated;
    }

    @Override
    public String delete(Long id) {

        Account account = this.get(id);

        accountRepository.delete(account);
        return "Deleted";
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account get(Long id) {

        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public Account deposit(UpdateAccountDto updateAccountDto) {
        Account toBeUpdated = this.get(updateAccountDto.getId());
        Long initialAmount = toBeUpdated.getBalance();
        Long finalAmount = initialAmount + updateAccountDto.getAmount();

        toBeUpdated.setBalance(finalAmount);
        accountRepository.save(toBeUpdated);
        return toBeUpdated;
    }

    @Override
    public Account withdrawal(UpdateAccountDto updateAccountDto) {
        Account toBeUpdated = this.get(updateAccountDto.getId());
        Long initialAmount = toBeUpdated.getBalance();

        if(initialAmount < toBeUpdated.getBalance() && toBeUpdated.getCustomer().getId() == updateAccountDto.getUserId()){
            throw new RuntimeException("You cant withdraw more than your balance");
        }else{
            Long finalAmount = initialAmount - updateAccountDto.getAmount();
            toBeUpdated.setBalance(finalAmount);
            accountRepository.save(toBeUpdated);
            return toBeUpdated;
        }
    }
}
