package com.softserve.edu07.sort.MyProjects.Homework2;

abstract public class GroundVehicle extends Passengers implements Vehicle{

    private Vehicle vehicle;

    public GroundVehicle (int passengers) {
        super.setPassengers(passengers);
    }

    abstract void drive();
}
