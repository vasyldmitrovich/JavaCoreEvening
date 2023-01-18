package com.softserve.edu15.homeTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        firstTask();


//        Object obj = new Object(); DEADLOCK
//        synchronized (obj) {
//            obj.wait();
//        }
        thirdTask();
    }

    static void firstTask() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("1 Thread " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("2 Thread " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("3 Thread " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread3.start();

    }

    static void thirdTask() throws InterruptedException {

        Thread thread = new Thread(new FirstThread());
        Thread.sleep(1000);
        thread.start();
    }
}

class FirstThread implements Runnable {

    @Override
    public void run() {
        Thread two = new Thread(new SecondThread());
        two.setName("two");
        two.start();
    }
}

class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number " + Thread.currentThread().getName());
        }
        Thread three = new Thread(new ThirdThread());
        three.setName("three");
        three.start();
    }
}

class ThirdThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number " + Thread.currentThread().getName());
        }
    }
}














