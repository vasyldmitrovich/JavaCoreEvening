package com.softserve.edu15_Thread.PracticalTask;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        go();
    }

    public static void go() throws InterruptedException{

        doTask1();

        doTask2();

    }

    public static void doTask1(){
        MyThread thread = new MyThread("I study Java", 1000, 10);
        thread.start();
    }

    public static void doTask2() throws InterruptedException {
        MyThread t1 = new MyThread("Hello, world", 2000, 5);
        MyThread t2 = new MyThread("Peace in the peace", 3000, 5);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("My name is Kate");
    }
}
