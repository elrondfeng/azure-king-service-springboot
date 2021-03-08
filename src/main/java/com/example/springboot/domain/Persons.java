package com.example.springboot.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Persons", schema="SalesLT")
public class Persons {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;

    @Column(name="LastName")
    private String lastName;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="Address")
    private String address;

    @Column(name="City")
    private String city;
}
