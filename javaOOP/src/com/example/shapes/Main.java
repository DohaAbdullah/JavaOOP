package com.example.shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(45);
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
    }
}
