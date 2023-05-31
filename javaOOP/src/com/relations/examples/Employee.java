package com.relations.examples;

public class Employee {

    private int id;
    private float salary;

    private PersonalInfo personalInfo;
    private Department department;


    public Employee() {
    }

    public Employee(int id, float salary, String firstName, String lastname, String bloodGroup, String accountNo, String nationality, int yearOfBirth, Department department) {
        this.id = id;
        this.salary = salary;
        this.personalInfo = new PersonalInfo(firstName, lastname, bloodGroup, accountNo, nationality, yearOfBirth);
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", department name=" + department.getDepName() + " , department no =" + department.getDepNo() +
                '}';
    }
}
