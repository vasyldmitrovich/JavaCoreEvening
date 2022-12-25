package com.softserve.edu07.sort.MyProjects.Homework2;

public class Helicopter extends FlyingVehicle{

    private int weight, maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying. ");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is standing on the land. ");
    }
}
