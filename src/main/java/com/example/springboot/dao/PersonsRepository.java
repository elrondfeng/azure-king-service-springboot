package com.example.springboot.dao;

import com.example.springboot.domain.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Persons, Integer> {
}
