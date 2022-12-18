package com.softserve.edu07.homeTask;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    public void isSailing() {
        System.out.println(this.getClass().getSimpleName() + " is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
