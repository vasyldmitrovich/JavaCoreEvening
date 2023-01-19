package com.softserve.edu15_Thread.HomeTask;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        ThreadTwo t2 = new ThreadTwo();
        t2.start();
    }
}
