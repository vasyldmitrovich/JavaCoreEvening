package com.softserve.edu15_Thread.HomeTask;

import com.softserve.edu15_Thread.HomeTask.Task2.Sqrt;
import com.softserve.edu15_Thread.HomeTask.Task2.ThreadDeadlockOne;
import com.softserve.edu15_Thread.HomeTask.Task2.ThreadDeadlockTwo;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        go();
    }

    public static void go() throws InterruptedException{
        //doTask1();

        doTask2();

        //doTask3();
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

    public static void doTask2(){
        Sqrt x = new Sqrt(2);
        Sqrt y = new Sqrt(3);

        ThreadDeadlockOne t1 = new ThreadDeadlockOne(x,y);
        ThreadDeadlockTwo t2 = new ThreadDeadlockTwo(x, y);

        t1.start();
        t2.start();

        try {
            //t1.start();
           // t2.start();
            Thread.sleep(100);
//            System.out.println(t1.getState());
//            System.out.println(t2.getState());
//
//            if ((t1.getState() == Thread.State.BLOCKED) & (t2.getState() == Thread.State.BLOCKED)){
//                t1.interrupt();
//                System.out.println(t1.getState());
//                t2.interrupt();
//                System.out.println(t1.getState());
//            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
//        finally {
//            t1.interrupt();
//            System.out.println(t1.getState());
//            t2.interrupt();
//            System.out.println(t1.getState());
//        }

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
