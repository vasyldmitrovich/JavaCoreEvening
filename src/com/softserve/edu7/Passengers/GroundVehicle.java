package com.softserve.edu7.Passengers;

abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }
    abstract void drive();
}
