package com.softserve.edu15.PracticalTasks;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        task2();
        System.out.println("My name is Thread");
    }

    public static void task2() throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }

    public static class MyThread1 extends Thread{
        public void run(){
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class MyThread2 extends Thread{
        public void run(){
            for (int i = 0; i < 2; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
