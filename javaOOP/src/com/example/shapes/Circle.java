package com.example.shapes;

public class Circle {
    private double radius;

    public String getColor() {
        return color;
    }

    private String color;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
