package com.softserve.edu06.practical_tasks;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();

    public abstract void stop();

    @Override
    public String toString() {
        return "Model='" + model + '\'' + ", Max speed=" + maxSpeed + ", Year of manufacture=" + yearOfManufacture;
    }
}
