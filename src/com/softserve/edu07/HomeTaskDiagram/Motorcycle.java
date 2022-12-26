package com.softserve.edu07.HomeTaskDiagram;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }

    @Override
    public String toString() {
        return "Motorcycle{passengers=" +this.getPassengers()+
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
