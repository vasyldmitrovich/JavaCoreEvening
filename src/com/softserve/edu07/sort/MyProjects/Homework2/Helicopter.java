package com.softserve.edu07.sort.MyProjects.Homework2;

public class Helicopter extends FlyingVehicle{

    private int weight, maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    public int getMaxHeight() {
        return maxHeight;
    }


    @Override
    public void fly() {
        System.out.print("Helicopter is flying. ");
    }

    @Override
    public void land() {
        System.out.print("Helicopter is standing on the land. ");
    }
}
