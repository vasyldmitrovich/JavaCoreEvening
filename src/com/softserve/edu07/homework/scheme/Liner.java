package com.softserve.edu07.homework.scheme;

public class Liner extends WaterVehicle {
    int floors;

     public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {

        System.out.println("This Vehicle is " + this.getClass().getSimpleName()
                + " and can sailing. Total capacity is " + this.getPassengers()
                + " person, located on " + this.getFloors() + " floors");
        System.out.println("-----------------------------------------------------------------------");
    }
}
