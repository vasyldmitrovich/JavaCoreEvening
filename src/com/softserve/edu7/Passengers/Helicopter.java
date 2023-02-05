package com.softserve.edu7.Passengers;

public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helocopter is flying");

    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");

    }
}