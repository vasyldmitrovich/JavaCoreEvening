package com.softserve.edu07.homeWork.Schema;

public class Helicopter extends FlyingVehicle{
    public int weight;
    public int maxHeight;

    public Helicopter(int weight, int maxHeight, int passengers){
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
    public void fly(){
        System.out.println("На борту " + passengers + " пасажирів. Максимальна висота: " + maxHeight + " вага: " + weight);
    }
    public void land(){
        System.out.println("Гелікоптер приземлився");
    }
}
