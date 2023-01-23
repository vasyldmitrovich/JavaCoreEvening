package com.softserve.edu15.Homework;

public class Methods {

    public void run() throws InterruptedException {
        Thread_1 thread_1 = new Thread_1();
        Thread_2 thread_2 = new Thread_2();
        Thread_3 thread_3 = new Thread_3();

        thread_1.start();
        thread_2.start();
        thread_3.start();
        //thread_1.join();
        //thread_2.join();
        //thread_3.join();

    }
}
