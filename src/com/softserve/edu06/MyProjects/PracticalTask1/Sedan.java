package com.softserve.edu06.MyProjects.PracticalTask1;

public class Sedan extends Car {

    public Sedan() {

    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super.model = model;
        super.maxSpeed = maxSpeed;
        super.yearOfManufacture = yearOfManufacture;
//        System.out.println("Constructor Sedan");
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }

    public String getModel() {
        return super.model;
    }
}
