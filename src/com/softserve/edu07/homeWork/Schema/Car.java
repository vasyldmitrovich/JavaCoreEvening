package com.softserve.edu07.homeWork.Schema;

public class Car extends GroundVehicle{
    public String model;
    public Car(String model, int passengers){
        super(passengers);
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void drive (){
        System.out.println("Модель авто: " + model + ". В автомобілі " + passengers + " пасажирів.");
    }
}
