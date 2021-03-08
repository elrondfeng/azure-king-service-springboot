package com.example.springboot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Customer", schema="SalesLT")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="CustomerID")
    Long customerID;
    
    String  nameStyle;
    String title;
    String firstName;
    String middleName;
    String lastName;
    String suffix;
    String companyName;
    String salePerson;
    String emailAddress;
    String phone;
    String passwordHash;
    String passwordSalt;
    Date modifiedDate;

}
