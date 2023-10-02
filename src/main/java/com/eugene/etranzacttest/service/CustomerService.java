package com.eugene.etranzacttest.service;

import com.eugene.etranzacttest.model.Customer;
import com.eugene.etranzacttest.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer get(Long id);

    Customer create(Customer customer);

    String delete(Long id);

    Customer update(Customer customer);

}
