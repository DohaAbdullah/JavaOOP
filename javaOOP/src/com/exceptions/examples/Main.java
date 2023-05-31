package com.exceptions.examples;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("!");
        System.out.println("2");

        try {
            int[] arr = null;
            System.out.println(arr[5]);

        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            int val = Integer.parseInt("1DEF4");
            System.out.println(val);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        try {
            int x = 5/0;
            System.out.println(x);
        } catch (ArithmeticException e){
            System.out.println(e);
        }




    }
}
