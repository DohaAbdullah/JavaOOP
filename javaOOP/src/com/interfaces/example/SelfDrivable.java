package com.interfaces.example;

public interface SelfDrivable {
    void destination(String d);
    void drive();

    default void newMethode(){
        System.out.println("New method");
    }
}
