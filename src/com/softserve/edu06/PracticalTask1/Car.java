package com.softserve.edu06.PracticalTask1;

abstract public class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    public Car() {
//        System.out.println("Constructor Car");
    }

    abstract void run();

    abstract void stop();

    @Override
    public String toString() {
        return "Model = " + model +
                ", Max speed = " + maxSpeed +
                ", Year of manufactured = " + yearOfManufacture;
    }
}