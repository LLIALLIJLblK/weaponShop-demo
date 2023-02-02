package com.example.deveducatecore.controller;

import com.example.deveducatecore.entity.Customer;
import com.example.deveducatecore.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping(value = "/get/{id}")
    public Customer getCustomer(@PathVariable("id") Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping(value = "/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
        System.out.println("success");
    }

    @GetMapping(value = "/get")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public List<Customer> findCustomerByCustomerName(@PathVariable("name") String customerName) {
        return customerService.findCustomerByName(customerName);
    }
}
