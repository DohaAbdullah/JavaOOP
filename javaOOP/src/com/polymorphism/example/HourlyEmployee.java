package com.polymorphism.example;



public class HourlyEmployee extends Employee {
    private float workPrice;
    private int hourRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, float workPrice, int hourRate) {
        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.workPrice = workPrice;
        this.hourRate = hourRate;
    }

    @Override
    public float getSalary() {
        return workPrice*hourRate;
    }

    public float getWorkPrice() {
        return workPrice;
    }

    public void setWorkPrice(float workPrice) {
        this.workPrice = workPrice;
    }

    public int getHourRate() {
        return hourRate;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    public void print(){
        System.out.println("Hour Employee print");
    }
}

