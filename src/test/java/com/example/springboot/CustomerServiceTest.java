package com.example.springboot;

import com.example.springboot.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootTest(classes={com.example.springboot.Application.class})
@Import(com.example.springboot.service.CustomerService.class)
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void testGet() {
        customerService.findAll();
    }

    @Test
    void testNull () {
        System.out.println("exellent");
    }
}
