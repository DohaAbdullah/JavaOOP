package com.exceptions.examples;

public class ThrowEX {
    public static void main(String[] args) {
        try{
            validate(-1);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }

    public static void validate(int number) throws ArithmeticException {
        if (number <= 0) {
//            System.out.println("Number must be greater than zero");
            ArithmeticException ae= new ArithmeticException("Number must be greater than zero");
            throw ae;
        } else {
            System.out.println("the number has been entered ");
        }
    }
}
