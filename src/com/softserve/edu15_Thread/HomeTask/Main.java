package com.softserve.edu15_Thread.HomeTask;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        go();
    }

    public static void go() throws InterruptedException{
        doTask1();

        doTask3();
    }

    public static void doTask1() throws InterruptedException {
        MyRunnable r1 = new MyRunnable("First thread",0,5);
        Thread t1 = new Thread(r1);

        MyRunnable r2 = new MyRunnable("Second thread",0,5);
        Thread t2 = new Thread(r2);

        MyRunnable r3 = new MyRunnable("\nThird thread",0,5);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
    }

    public static void doTask3(){

        ThreadOne t1 = new ThreadOne();

        t1.start();
    }
}
