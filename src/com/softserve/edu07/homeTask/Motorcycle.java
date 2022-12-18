package com.softserve.edu07.homeTask;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {
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
}
