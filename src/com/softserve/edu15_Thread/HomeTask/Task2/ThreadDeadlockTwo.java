package com.softserve.edu15_Thread.HomeTask.Task2;

public class ThreadDeadlockTwo extends Thread{
    private Sqrt x;
    private Sqrt y;

    public ThreadDeadlockTwo(Sqrt x, Sqrt y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        synchronized (y){
                try {
                    Thread.sleep(10);
                    y.doSqrt();
                } catch (InterruptedException e) {
                    System.out.println(e.fillInStackTrace());
                }
                synchronized (x) {
                    x.doSqrt();
                    System.out.println("Thread two");
                    System.out.println("x=" + x + "; y=" + y);
                }
        }
    }
}
