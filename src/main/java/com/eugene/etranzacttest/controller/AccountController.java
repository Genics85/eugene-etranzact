package com.eugene.etranzacttest.controller;

import com.eugene.etranzacttest.model.Account;
import com.eugene.etranzacttest.model.Customer;
import com.eugene.etranzacttest.model.dto.UpdateAccountDto;

import java.util.List;

public interface AccountController {

    List<Account> getAll();

    Account get (Long id);

    String delete(Long id);

    Account update(Account account);

    Account deposit(UpdateAccountDto updateAccountDto);

    Account withdrawal(UpdateAccountDto updateAccountDto);
}
