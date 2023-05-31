package com.interfaces.example;

public class CarV2 implements Movable , SelfDrivable{
    private int x,y;
    private int numberOfPassengers;

    public CarV2() {
    }

    public CarV2(int x, int y, int numberOfPassengers) {
        this.x = x;
        this.y = y;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void destination(String d) {
        System.out.println("Destination =" + d);
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }
}
