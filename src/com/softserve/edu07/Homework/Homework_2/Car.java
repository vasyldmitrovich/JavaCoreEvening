package com.softserve.edu07.Homework.Homework_2;

public class Car extends GroundVehicle{

    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
