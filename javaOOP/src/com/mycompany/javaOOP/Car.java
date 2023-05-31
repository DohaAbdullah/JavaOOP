package com.mycompany.javaOOP;

public class Car {
    private static String name;
    private int maxSpeed;
    private float price;
    private int model;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setModel(int m) {

        if (m >= 2015) {
            model = m;
        } else {
            System.out.println("We don't register cars less than 2015 model !");
        }

    }

    int getModel() {
        return model;
    }

    void setMaxSpeed(int ms) {
        maxSpeed = ms;
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    void setPrice(float p) {
        price = p;
    }

    float getPrice() {
        return price;
    }
}
