package com.softserve.edu15.Homework;

public class Thread_3 extends Thread {

    @Override
    public void run() {
        try {
            Thread_3.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread #3");
        }
    }
}
