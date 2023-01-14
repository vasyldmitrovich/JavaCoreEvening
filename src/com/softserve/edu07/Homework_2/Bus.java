package com.softserve.edu07.Homework_2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving.");
    }

    public Bus(String route) {
        this.route = route;
    }

    public String route() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }


}
