package com.softserve.edu07.homeWork.Schema;

public class Motorcycle extends GroundVehicle {
    public int maxSpeed;
    public Motorcycle(int maxSpeed, int passengers){
       super(passengers);
       this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void drive(){
        System.out.println("Максимальна швидкість мотоцикла: " + maxSpeed + ". Може перевозити " + passengers + " пасажира.");
    }
}
