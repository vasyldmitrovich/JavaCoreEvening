package com.softserve.edu06.practicalTask;

public class Truck extends Car{


    public Truck(String model, int maxSpeed, int year) {
        super(model, maxSpeed, year);
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName()+ " is running");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName()+ " is stopping");
    }

}
