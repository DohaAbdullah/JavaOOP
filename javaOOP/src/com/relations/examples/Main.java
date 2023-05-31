package com.relations.examples;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(123 , "IT");
        Employee employee = new Employee(12, 2345, "Doha", "Ali", "B+", "12s", "PKI", 1998, department);
        System.out.println(employee.toString());
    }
}
