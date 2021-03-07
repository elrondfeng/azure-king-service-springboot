package com.example.springboot.service;

import com.example.springboot.dao.AccountMapper;
import com.example.springboot.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public List<Account> findAll(){
        return accountMapper.findAll();
    }

    public void addEnrollment(int id){
        accountMapper.addEnrollment(id);
    }

    public void deleteEnrollment(int id){
        accountMapper.deleteEnrollment(id);
    }
}
