package com.softserve.edu07.HomeTaskDiagram;

public class Plane extends FlyingVehicle{
    private int maxDistance;

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
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public String toString() {
        return "Plane{passengers=" +this.getPassengers()+
                ", maxDistance=" + maxDistance +
                '}';
    }
}
