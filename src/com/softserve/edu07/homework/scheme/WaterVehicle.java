package com.softserve.edu07.homework.scheme;

public abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
