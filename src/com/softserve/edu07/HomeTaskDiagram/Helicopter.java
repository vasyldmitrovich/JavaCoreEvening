package com.softserve.edu07.HomeTaskDiagram;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing");
    }

    @Override
    public String toString() {
        return "Helicopter{passengers=" +this.getPassengers()+
                ", weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
