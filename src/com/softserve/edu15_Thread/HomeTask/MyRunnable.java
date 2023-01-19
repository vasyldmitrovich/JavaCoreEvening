package com.softserve.edu15_Thread.HomeTask;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{
    private String message;
    private int pause;
    private int times;

    public MyRunnable(String message, int pause, int times) {
        this.message = message;
        this.pause = pause;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                sleep(pause);
            }catch (InterruptedException e){

            }

            System.out.println(message);
        }
    }
}
