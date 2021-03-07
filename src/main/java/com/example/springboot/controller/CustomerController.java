package com.example.springboot.controller;


import com.example.springboot.domain.Customer;
import com.example.springboot.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private static final String name = "CUSTOMERCONTROLLER";

    @Autowired
    CustomerService customerService;

    @CrossOrigin
    @GetMapping(path={"/customers"})
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

}
