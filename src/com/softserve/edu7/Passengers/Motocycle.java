package com.softserve.edu7.Passengers;

public class Motocycle extends GroundVehicle{
    private int maxSpeed;

    public Motocycle(int passengers, int maxSpeed) {
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
    void drive() {
        System.out.println("Motocycle is driving");
    }
}
