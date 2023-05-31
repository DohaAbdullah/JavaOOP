package com.multithread.example;

public class MultiThreadThing extends Thread {

    private int threadNumber;

    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
       for(int i = 1 ;  i <= 5 ; i++){
           System.out.println(i + " from thread " + threadNumber);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
