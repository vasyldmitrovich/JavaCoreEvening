package com.softserve.edu15_Thread.HomeTask;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            System.out.println("Thread number two");
        }

        MyRunnable r = new MyRunnable("Thread number three",0,5);
        Thread t = new Thread(r);
        t.start();
    }
}
