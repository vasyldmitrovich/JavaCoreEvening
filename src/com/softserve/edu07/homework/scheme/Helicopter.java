package com.softserve.edu07.homework.scheme;

public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("This Vehicle is " + this.getClass().getSimpleName()
                + ". It can fly on max height " + this.maxHeight + " meters, with maximum weight " + this.weight + " kg" + " and with " + this.getPassengers() + " passengers");
    }

    @Override
    public void land() {
        System.out.println("This vehicle is " + this.getClass().getSimpleName() + ". It can land anywhere");
        System.out.println("-----------------------------------------------------------------------");
    }
}
