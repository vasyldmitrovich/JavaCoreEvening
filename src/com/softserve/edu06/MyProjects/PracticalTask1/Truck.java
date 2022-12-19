package com.softserve.edu06.MyProjects.PracticalTask1;

public class Truck extends Car {

    public Truck () {

    }

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super.model = model;
        super.maxSpeed = maxSpeed;
        super.yearOfManufacture = yearOfManufacture;
//        System.out.println("Constructor Truck");
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }

}
