package com.softserve.edu07.homeTask;

public abstract class Passengers { //I think it is better to call this class VehicleBase, just because it is unusual that vehicles extends passengers
    private int passengers;

    public Passengers() {
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
