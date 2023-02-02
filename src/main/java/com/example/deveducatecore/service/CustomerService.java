package com.example.deveducatecore.service;

import com.example.deveducatecore.entity.Customer;
import com.example.deveducatecore.repository.CustomerRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void editCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> findCustomerByName(String customerName) {
        return customerRepository.findCustomerByCustomerName(customerName);
    }
}
