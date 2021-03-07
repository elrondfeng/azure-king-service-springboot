package com.example.springboot.dao;


import com.example.springboot.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    List<Account> findAll();

    void addEnrollment(int id);

    @Update("update zAdhoc.Feng_MyHER_Participants set Test_or_Control_Ind = 'E', Part_Begin_Dt = null where Account_Id = #{id}")
    void deleteEnrollment(@Param("id") int id);

}
