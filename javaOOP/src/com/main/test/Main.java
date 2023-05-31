package com.main.test;

public class Main {

    static void fun(Test n){
        n.number++;
    }

    public static void main(String[] args) {
        Test number = new Test();
        number.number = 1;
        fun(number);
        System.out.println(number.number);
    }
}
