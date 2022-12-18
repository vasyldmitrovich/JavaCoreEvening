package com.softserve.edu06.PracticalTasks.Cars;

import com.softserve.edu06.PracticalTasks.Cars.Car;

public class Truck extends Car {


    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
