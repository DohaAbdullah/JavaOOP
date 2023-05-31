package com.polymorphism.example;


public class SaleredEmployee extends Employee {
    protected float bonus;

    public SaleredEmployee() {
    }

    public SaleredEmployee(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, float bonus) {
        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.bonus = bonus;
    }


    @Override
    public float getSalary() {
        return super.getSalary() + bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public  void print(){
        System.out.println("Salered Employee print");
    }
}

