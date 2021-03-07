package com.example.springboot.dao;

import com.example.springboot.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {

    List<Customer> findAll();

}
