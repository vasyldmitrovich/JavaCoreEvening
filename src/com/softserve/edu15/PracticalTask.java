package com.softserve.edu15;

public class PracticalTask {
    public static void main(String[] args) throws InterruptedException {
        runFirstTask();
        runSecondTask();
    }

    public static void runFirstTask() throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        one.start();
        one.join();
    }

        public static void runSecondTask () {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello, world ");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Peace in the peace ");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.start();
    }
}

