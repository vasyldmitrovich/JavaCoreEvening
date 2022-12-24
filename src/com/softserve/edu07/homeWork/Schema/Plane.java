package com.softserve.edu07.homeWork.Schema;

public class Plane extends FlyingVehicle{
    public int maxDistance;
    public Plane(int maxDistance, int passengers){
        super(passengers);
        this.maxDistance = maxDistance;
    }
    public void fly(){
        System.out.println("На борту " + passengers + " пасажирів. Максимальна відстань: " + maxDistance);
    }
    public void land(){

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
