package com.softserve.edu7.Passengers;

abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    abstract void isSailing();
}
