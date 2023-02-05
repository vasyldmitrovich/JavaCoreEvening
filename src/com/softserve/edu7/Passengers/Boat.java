package com.softserve.edu7.Passengers;

public class Boat extends WaterVehicle {
    int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing");
    }
}
