package com.eugene.etranzacttest.service;

import com.eugene.etranzacttest.model.Customer;
import com.eugene.etranzacttest.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer get(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public Customer create(Customer customer) {

        return  customerRepository.save(customer);

    }

    @Override
    public String delete(Long id) {
        Customer customer = this.get(id);
        customerRepository.delete(customer);
        return "Deleted";

    }

    @Override
    public Customer update(Customer customer) {
        Customer customerToUpdate = get(customer.getId());
        customerToUpdate.setFirstName(customer.getFirstName());
        customerToUpdate.setLastName(customer.getLastName());
        customerRepository.save(customerToUpdate);
        return customerToUpdate;
    }
}
