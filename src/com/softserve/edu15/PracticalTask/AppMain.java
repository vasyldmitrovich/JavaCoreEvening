package com.softserve.edu15.PracticalTask;

public class AppMain {
    public static void main(String[] args) throws InterruptedException {

        //Output text «I study Java» 10 times with the intervals of one second
        //(Thread.sleep(1000);).

/*
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i + 1 + ") I study Java");
        }
*/

        //Output two messages «Hello, world» and «Peace in the peace» 5 times each with the
        //intervals of 2 seconds, and the second - 3 seconds. After printing messages, print the
        //text «My name is …»

        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello, world");
            }

        };
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Peace in the peace");
            }

        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("My name is Nazar");
    }
}
