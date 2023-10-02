package com.eugene.etranzacttest.controller;

import com.eugene.etranzacttest.model.ApiResponse;
import com.eugene.etranzacttest.model.Customer;
import com.eugene.etranzacttest.model.dto.CustomerDto;
import com.eugene.etranzacttest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerControllerImpl implements CustomerController {

    CustomerService customerService;

    @Autowired
    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @Override
    public List<Customer> getAll() {
        List<Customer> customers = customerService.getAll();

        return customers;
    }

    @GetMapping("/{id}")
    @Override
    public Customer get(@PathVariable("id") Long id) {

        return customerService.get(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public String delete(@PathVariable("id") Long id) {

        return customerService.delete(id);
    }

    @PutMapping
    @Override
    public Customer update(@RequestBody Customer customer) {

        return customerService.update(customer);
    }

    @PostMapping
    @Override
    public Customer create( @RequestBody  Customer customer) {

        return customerService.create(customer);
    }
}
