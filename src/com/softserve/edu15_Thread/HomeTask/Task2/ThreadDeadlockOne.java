package com.softserve.edu15_Thread.HomeTask.Task2;

public class ThreadDeadlockOne extends Thread{
    private Sqrt x;
    private Sqrt y;

    public ThreadDeadlockOne(Sqrt x, Sqrt y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        synchronized (x){
            for (int i = 0; i <5; i++) {
                try {
                    Thread.sleep(5);
                    x.doSqrt();
                }
                catch (InterruptedException e){
                    System.out.println(e.fillInStackTrace());
                }
                synchronized (y){
                    y.doSqrt();
                    System.out.println("Thread one");
                    System.out.println("x="+x+"; y="+y);
                }
            }
        }
    }
}
