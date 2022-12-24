package com.softserve.edu07.homeWork.Schema;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers){
        super(passengers);

    }
    public abstract void fly();
    public abstract void land();
}
