package com.softserve.edu07.HomeTaskDiagram;

public class Car extends GroundVehicle{
    private String model;

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
        System.out.println("Car is driving");
    }

    @Override
    public String toString() {
        return "Car{passengers=" +this.getPassengers()+
                ", model='" + model + '\'' +
                '}';
    }
}
