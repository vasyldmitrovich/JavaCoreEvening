package com.softserve.edu06.PracticalTask1;

public class Truck extends Car {

    public Truck () {

    }

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super.model = model;
        super.maxSpeed = maxSpeed;
        super.yearOfManufacture = yearOfManufacture;
      System.out.println("Constructor Truck");
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

}
