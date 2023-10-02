package com.eugene.etranzacttest.controller;

import com.eugene.etranzacttest.model.Account;
import com.eugene.etranzacttest.model.dto.UpdateAccountDto;
import com.eugene.etranzacttest.service.AccountService;

import java.util.List;

public class AccountControllerImpl implements AccountController {

    AccountService accountService;

    public AccountControllerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @Override
    public Account get(Long id) {
        return accountService.get(id);
    }

    @Override
    public String delete(Long id) {

        return accountService.delete(id);
    }

    @Override
    public Account update(Account account) {
        return accountService.update(account);
    }

    @Override
    public Account deposit(UpdateAccountDto updateAccountDto) {
        return accountService.deposit(updateAccountDto);
    }

    @Override
    public Account withdrawal(UpdateAccountDto updateAccountDto) {
        return accountService.withdrawal(updateAccountDto);
    }
}
