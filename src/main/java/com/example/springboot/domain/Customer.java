package com.example.springboot.domain;

import java.util.Objects;

public class Customer {

    Integer customerID;
    String  nameStyle;
    String title;
    String firstName;
    String middleName;
    String lastName;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(String nameStyle) {
        this.nameStyle = nameStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID) &&
                Objects.equals(nameStyle, customer.nameStyle) &&
                Objects.equals(title, customer.title) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(middleName, customer.middleName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, nameStyle, title, firstName, middleName, lastName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", nameStyle='" + nameStyle + '\'' +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
