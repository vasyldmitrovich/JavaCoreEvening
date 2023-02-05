package com.softserve.edu7.Passengers;

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
    void isSailing() {
        System.out.println("Liner is sailing");
    }
}
