package com.softserve.edu07.Homework_2;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner() {
    }

    public Liner(int floors) {
        this.floors = floors;
    }

    public int floors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing.");
    }
}
