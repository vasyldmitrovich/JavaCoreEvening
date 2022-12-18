package com.softserve.edu07.homeTask;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");

    }

}
