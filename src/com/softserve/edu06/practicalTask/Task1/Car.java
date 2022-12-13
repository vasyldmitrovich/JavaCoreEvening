package com.softserve.edu06.practicalTask.Task1;

public abstract class Car {

    protected String model;
    protected double maxSpeed;
    protected int yearOfManufacture;

    public Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();

    public abstract void stop();

}
