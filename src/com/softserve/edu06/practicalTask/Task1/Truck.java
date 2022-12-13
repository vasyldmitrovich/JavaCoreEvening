package com.softserve.edu06.practicalTask.Task1;

public class Truck extends Car{

    public Truck(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("Truck " + this.model + " is running...");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + this.model + " is stopping...");
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
