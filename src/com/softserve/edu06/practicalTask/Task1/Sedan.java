package com.softserve.edu06.practicalTask.Task1;

public class Sedan extends Car{

    public Sedan(String model, double maxSpeed, int manufactureYear){
        super(model, maxSpeed, manufactureYear);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + this.model + " is running...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + this.model + " is stopping...");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
