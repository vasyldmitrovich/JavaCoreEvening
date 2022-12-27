package com.softserve.edu06.PracticalTasks.Cars;

import com.softserve.edu06.PracticalTasks.Cars.Car;

public class Truck extends Car {
    public String type;
    public Truck(String model, int speed, int year, String type) {
        this.model = model;
        maxSpeed = speed;
        yearOfManufacture = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nTruck{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    @Override
    public void run() {
        System.out.println(this+" runs");
    }

    @Override
    public void stop() {
        System.out.println(this+" stops");
    }
}
