package com.com.reallifeexample;

public class Account {
    private int accountNumber;
    protected String name;
    public float amount;

    String address;

    public void insert(int a , String n , float amt){
        this.accountNumber = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println("Amount deposited ="+ amt);
    }

    public void withdraw(float amt){
        if(amt > amount){
            System.out.println("insufficient balance");
        } else {
            this.amount = this.amount - amt;
            System.out.println("withdraw" + amt);
        }
    }

    public void checkBalance(){
        System.out.println("balance is ="+ this.amount);
    }
}
