package com.softserve.edu06.PracticalTasks.Cars;

import com.softserve.edu06.PracticalTasks.Cars.Car;

public class Sedan extends Car {
    public Sedan(String model, int speed, int year) {
        this.model = model;
        maxSpeed = speed;
        yearOfManufacture = year;
    }

    @Override
    public String toString() {
        return "\nSedan{" +
                "model='" + model + '\'' +
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
