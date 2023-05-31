package com.inheritance.example;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Ali");
        System.out.println(developer.getName());

        MobileDeveloper mb = new MobileDeveloper();
        mb.setName("Waseem");
        System.out.println(mb.getName());
    }
}
