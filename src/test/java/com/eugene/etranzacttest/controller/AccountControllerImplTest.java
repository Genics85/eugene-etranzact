package com.eugene.etranzacttest.controller;

import com.eugene.etranzacttest.model.Account;
import com.eugene.etranzacttest.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.configuration.IMockitoConfiguration;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class AccountControllerImplTest {
    @InjectMocks
    AccountControllerImpl underTest;
    @Mock
    AccountService service;
    Account res = new Account();


    List<Account> listRes = new ArrayList<Account>((Collection<? extends Account>) res);

    @Test
    void getAll() {
        Mockito.when(service.getAll()).thenReturn(listRes);

        List<Account> expected = underTest.getAll();


        assertEquals(listRes.stream().count(),expected.stream().count());
        Mockito.verify(service,times(1)).getAll();
    }

    @Test
    void get() {

        Mockito.when(service.get(any())).thenReturn(res);


    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void deposit() {
    }

    @Test
    void withdrawal() {
    }
}