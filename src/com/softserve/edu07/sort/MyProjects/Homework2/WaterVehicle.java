package com.softserve.edu07.sort.MyProjects.Homework2;

abstract public class WaterVehicle extends Passengers implements Vehicle{
    private Vehicle vehicle;

    public WaterVehicle(int passengers) {
        super.setPassengers(passengers);
    }

    abstract void isSailing();
}
