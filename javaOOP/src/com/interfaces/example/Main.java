package com.interfaces.example;

public class Main {
    public static void main(String[] args) {
        SelfDrivable carV1 = new CarV1();
        carV1.drive();
        carV1 = new CarV2();
        carV1.drive();
    }
}
