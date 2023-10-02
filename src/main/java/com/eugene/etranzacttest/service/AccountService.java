package com.eugene.etranzacttest.service;

import com.eugene.etranzacttest.model.Account;
import com.eugene.etranzacttest.model.dto.UpdateAccountDto;

import java.util.List;

public interface AccountService {
    Account create( Account account);

    Account update(Account account);

    String delete(Long id);

    List<Account> getAll();

    Account get(Long id);

    Account deposit(UpdateAccountDto updateAccountDto);

    Account withdrawal(UpdateAccountDto updateAccountDto);


}
