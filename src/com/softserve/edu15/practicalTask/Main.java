package com.softserve.edu15.practicalTask;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        firstTask();
        secondTask();
    }

    static void firstTask() throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread.join();

    }

    static void secondTask() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("my name is Zhenya");
        });
        thread.start();
    }
}
