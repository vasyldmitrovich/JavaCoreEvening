package com.softserve.edu06.PracticalTask;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println(this.getModel() + " starts running");
    }

    @Override
    public void stop() {
        System.out.println(this.getModel() + " stops");

    }
}
