package com.example.springboot.service;

import com.example.springboot.dao.PersonsRepository;
import com.example.springboot.domain.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonsRepository personsRepository;

    public List<Persons> findAll(){
        return personsRepository.findAll();
    }


}

