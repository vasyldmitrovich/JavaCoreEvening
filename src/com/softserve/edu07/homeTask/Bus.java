package com.softserve.edu07.homeTask;

public class Bus extends GroundVehicle{
    private String route;

    public Bus() {
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

}
