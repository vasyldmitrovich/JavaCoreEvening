package com.softserve.edu07.Homework.Homework_2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
    }

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int maxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane is fly.");
    }

    @Override
    public void land() {
        System.out.println("Plane starts to land.");
    }
}
