package com.softserve.edu07.homework.scheme;

public class Motorcycle extends GroundVehicle {
    int maxSpeed;

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
        System.out.println("This vehicle is " + this.getClass().getSimpleName()
                + ", total capacity passengers is " + this.getPassengers() + " and max speed is " + this.getMaxSpeed() + " km/h");
        System.out.println("-----------------------------------------------------------------------");
    }
}
