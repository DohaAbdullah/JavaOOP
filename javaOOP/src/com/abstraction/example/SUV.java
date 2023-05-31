package com.abstraction.example;

public class SUV extends Car{

    int x;

    public SUV(int x) {
        this.x = x;
    }

    public SUV(float height, float weight, int numberOfWheels, int x) {
        super(height, weight, numberOfWheels);
        this.x = x;
    }

    @Override
    void autopilot() {
        System.out.println("SUV ");
    }

    @Override
    void streamingServices() {

    }

    @Override
    void parkingSensors() {

    }
}
