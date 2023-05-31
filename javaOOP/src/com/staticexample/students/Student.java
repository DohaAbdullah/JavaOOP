package com.staticexample.students;

public class Student {

    private static int count = 1;
    int no;
    private String name;
    private static String password;
    private static int minimumPasswordLength = 6;
    private boolean loggedIn = false;
    static String college = "IT";

    public Student(String name, String password) {
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public boolean logIn(int enteredNo, String enteredPassword) {
        if (enteredNo == no && enteredPassword.equals(password)) {
            loggedIn = true;

            return true;
        } else {
            return false;
        }

    }


    public static boolean validatePassword(String password) {

        if(password.length() >= minimumPasswordLength )
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "count=" + count +
                ", no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
