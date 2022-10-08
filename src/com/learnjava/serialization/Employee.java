package com.learnjava.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    public String firstname;
    public String lastname;
    public String dob;
    public String department;
    public transient int numberOfEmployees = 30;

    public Employee() {}

    public Employee(String firstname, String lastname, String dob, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob='" + dob + '\'' +
                ", department='" + department + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}