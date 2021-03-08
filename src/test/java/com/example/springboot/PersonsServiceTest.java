package com.example.springboot;

import com.example.springboot.domain.Persons;
import com.example.springboot.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration
@SpringBootTest(classes={Application.class})
@Import(com.example.springboot.service.PersonService.class)
public class PersonsServiceTest {

    @Autowired
    PersonService personService;

    @Test
    void testGet() {
        List<Persons> persons = personService.findAll();
        System.out.println("good");
    }

}
