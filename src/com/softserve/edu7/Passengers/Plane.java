package com.softserve.edu7.Passengers;

public class Plane extends FlyingVehicle{
    int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane is flying");

    }

    @Override
    void land() {
        System.out.println("Plan is landing");

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
