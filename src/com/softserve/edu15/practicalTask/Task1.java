package com.softserve.edu15.practicalTask;

public class Task1 {
    public static void main(String[] args) {
        try {
            run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws InterruptedException {
        for (int i = 0; i < 10; i++){
            System.out.println("I study java");
            Thread.sleep(1000);
        }
    }
}
