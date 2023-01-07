package com.softserve.edu07.homework.scheme;

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
    public void isSailing() {
        System.out.println("This Vehicle is " + this.getClass().getSimpleName()
                + " and can sailing. Total capacity is " + this.getPassengers()
                + " person, placed on a boat with a capacity of " + getVolume() + " something :)");
        System.out.println("-----------------------------------------------------------------------");
    }
}
