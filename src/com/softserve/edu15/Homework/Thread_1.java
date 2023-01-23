package com.softserve.edu15.Homework;

public class Thread_1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread #1");
        }
    }
}
