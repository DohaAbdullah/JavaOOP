package com.staticexample.students;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student( "Doha" , "123");
        Student student2 = new Student( "Ali", "1234");
        Student student3 = new Student( "Hamza" , "12345");
        Student student4 = new Student( "Saad","123456");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
    }
}
