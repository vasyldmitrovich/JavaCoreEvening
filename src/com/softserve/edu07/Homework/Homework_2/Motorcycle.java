package com.softserve.edu07.Homework.Homework_2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle() {
    }

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving.");
    }
}
