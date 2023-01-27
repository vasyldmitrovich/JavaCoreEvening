package com.softserve.edu06.PracticalTask1;

public class Sedan extends Car {

    public Sedan() {

    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super.model = model;
        super.maxSpeed = maxSpeed;
        super.yearOfManufacture = yearOfManufacture;
        System.out.println("Constructor Sedan");
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public String getModel() {
        return super.model;
    }
}
