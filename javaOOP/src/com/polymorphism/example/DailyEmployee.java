package com.polymorphism.example;



public class DailyEmployee extends Employee {
    private float workdayPrice;
    private int dailyRate;

    public DailyEmployee() {
    }

    public DailyEmployee(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, float workdayPrice, int dailyRate) {
        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.workdayPrice = workdayPrice;
        this.dailyRate = dailyRate;
    }


    @Override
    public float getSalary() {
        return workdayPrice*dailyRate;
    }

    public float getWorkdayPrice() {
        return workdayPrice;
    }

    public void setWorkdayPrice(float workdayPrice) {
        this.workdayPrice = workdayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public  void print(){
        System.out.println("Daily Employee print");
    }
}
