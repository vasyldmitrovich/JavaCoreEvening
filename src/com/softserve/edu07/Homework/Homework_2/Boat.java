package com.softserve.edu07.Homework.Homework_2;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat() {
    }

    public Boat(int volume) {
        this.volume = volume;
    }

    public int volume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing.");

    }
}
