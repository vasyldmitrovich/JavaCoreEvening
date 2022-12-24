package com.softserve.edu07.homeWork.Schema;

public abstract class Passengers {
    public int passengers;
    public Passengers(int passengers){
        this.passengers = passengers;
    }

    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
}

