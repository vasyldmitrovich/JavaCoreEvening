package com.softserve.edu07.sort.MyProjects.Homework2;

abstract public class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle(int passengers) {
        super.setPassengers(passengers);
    }

    abstract public void fly();

    abstract void land();
}
