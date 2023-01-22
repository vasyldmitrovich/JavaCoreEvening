package com.softserve.edu07.Homework.Homework_2;

public abstract class Passengers {

    private int passengers;

    public Passengers() {
    }

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int passengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
