package com.inheritance.example;

public class Developer extends Employee {

    String projectName;

    public Developer(){};

    public Developer(  String name,
                       String emailAddress,
                       String phone,
                       String department,
                       String address,
                       int yearOfBirth , String projectName , float salary) {
        super(name,
                emailAddress,
                phone,
                department,
                address,
                yearOfBirth , salary);
        this.projectName = projectName;
    }
}
