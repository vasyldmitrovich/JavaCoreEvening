package com.softserve.edu07.homework.scheme;

public class Plane extends FlyingVehicle {
    int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("This Vehicle is " + this.getClass().getSimpleName() + ". It can fly on max distance " + this.getMaxDistance()+" km");
    }

    @Override
    public void land() {
        System.out.println("This vehicle is " + this.getClass().getSimpleName() + ". It can land on the airport runway");
        System.out.println("-----------------------------------------------------------------------");
    }
}
