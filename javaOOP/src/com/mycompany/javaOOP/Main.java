package com.mycompany.javaOOP;

import com.com.reallifeexample.Account;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getName()); // """
        car.setName("KIA");
        System.out.println(car.getName()); // KIA

        car.setModel(2023);
        System.out.println(car.getModel()); // 2023
        car.setModel(2012);
        System.out.println(car.getModel()); // error


        Car car1 = new Car();
        // KIA
       car1.setName("bmw");
       System.out.println(car1.getName() + " " + car1.getModel()); // bmw 0


//        Account account = new Account();
//        System.out.println(account.accountNumber); // private
//        System.out.println(account.name); // protected
//        System.out.println(account.amount); // public
//        System.out.println(account.address); // by default

    }
}