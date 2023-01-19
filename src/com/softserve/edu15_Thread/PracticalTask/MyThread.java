package com.softserve.edu15_Thread.PracticalTask;

public class MyThread extends Thread{
    private String message;
    private int pause;
    private int times;

    public MyThread(String message, int pause, int times) {
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
