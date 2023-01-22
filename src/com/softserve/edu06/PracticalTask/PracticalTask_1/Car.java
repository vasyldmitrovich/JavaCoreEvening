package com.softserve.edu06.PracticalTask.PracticalTask_1;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {
        System.out.println("Car is running.");
    }
    public void stop() {
        System.out.println("Car stopped.");
    }
    public void showInfo() {
        System.out.println(model + ',' + maxSpeed + ',' + yearOfManufacture + '.');
    }
}
