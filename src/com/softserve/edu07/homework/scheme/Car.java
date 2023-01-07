package com.softserve.edu07.homework.scheme;

public class Car extends GroundVehicle {
    String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("This vehicle is " + this.getClass().getSimpleName()
                + ". Model is " + this.getModel() + ", total capacity passengers is " + this.getPassengers());
    }
}
