package com.softserve.edu15_Thread.HomeTask.Task2;

public class Main {
    public static void main(String[] args) {
        Sqrt x = new Sqrt(2);
        Sqrt y = new Sqrt(3);

        ThreadDeadlockOne t1 = new ThreadDeadlockOne(x,y);
        ThreadDeadlockTwo t2 = new ThreadDeadlockTwo(x, y);

        t1.start();
        t2.start();


        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
