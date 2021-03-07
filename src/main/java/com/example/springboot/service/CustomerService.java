package com.example.springboot.service;


import com.example.springboot.dao.CustomerMapper;
import com.example.springboot.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<Customer> findAll(){
        return customerMapper.findAll();
    }

    public static String get() {
        return "Hello Junit 5";
    }

}
