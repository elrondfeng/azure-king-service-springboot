package com.example.springboot.controller;


import com.example.springboot.domain.Account;
import com.example.springboot.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EnrollmentController {

    private static final Logger logger = LoggerFactory.getLogger(EnrollmentController.class);
    private static final String name = "FENG";

    @Autowired
    AccountService accountService;

    @CrossOrigin
    @GetMapping(path ={ "/enrollments" })
    public List<Account> getEnrollment() {
        logger.debug("getEnrollment got called ********  ");
        return accountService.findAll();
    }

    @CrossOrigin
    @PostMapping(path = { "/enrollment/{id}" })
    public void addEnrollment(@PathVariable("id")  int id) {
        logger.debug("addEnrollment got called ********  "+ id);
        accountService.addEnrollment(id);
    }

    @CrossOrigin
    @DeleteMapping(path = { "/enrollment/{id}" })
    public void deleteEnrollment(@PathVariable("id")  int id) {
        logger.debug("deleteEnrollment got called ********  "+ id);
        accountService.deleteEnrollment(id);
    }

}
