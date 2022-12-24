package com.softserve.edu07.homeWork.Schema;

public class Boat extends WaterVehicle{
    public  int volume;
    public Boat(int volume, int passengers){
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void isSailing(){
       System.out.println("В човні " + passengers + " пасажирів. Oб'єм човна: " + volume);
    }
}
