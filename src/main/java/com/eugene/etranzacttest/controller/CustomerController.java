package com.eugene.etranzacttest.controller;

import com.eugene.etranzacttest.model.ApiResponse;
import com.eugene.etranzacttest.model.Customer;
import com.eugene.etranzacttest.model.dto.CustomerDto;

import java.util.List;

public interface CustomerController {
    List<Customer> getAll();

    Customer get (Long id);

   String delete(Long id);

    Customer update(Customer customer);

    Customer create(Customer customer);

}
