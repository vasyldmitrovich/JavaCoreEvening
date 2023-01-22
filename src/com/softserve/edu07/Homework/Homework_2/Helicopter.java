package com.softserve.edu07.Homework.Homework_2;

public class Helicopter extends FlyingVehicle{

    private int weight;

    private int maxHeight;

    public Helicopter() {
    }

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is fly.");

    }

    @Override
    public void land() {
        System.out.println("Helicopter starts to land.");

    }
}
