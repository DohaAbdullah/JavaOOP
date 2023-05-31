package com.multithread.example;

public class Multithreading {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            MultiThreadThing myThing = new MultiThreadThing(i);
            myThing.start();
        }


    }
}
