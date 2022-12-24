package com.softserve.edu07.homeWork.Schema;

public class Liner extends  WaterVehicle{
    public int floors;
    public Liner(int floors, int passengers){
        super(passengers);
        this.floors = floors;
    }
    public void isSailing(){
        System.out.println("На лайнері " + passengers + " пасажирів. Кількість поверхів: " + floors);
    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(){
        this.floors = floors;
    }
}
