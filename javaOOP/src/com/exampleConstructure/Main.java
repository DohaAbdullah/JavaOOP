package com.exampleConstructure;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.getName();
        System.out.println(product.toString());
        Product product1 = new Product("shampoo", 5.6f);
        System.out.println(product1.toString());
    }
}
