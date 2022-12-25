package com.softserve.edu07.sort.MyProjects.Homework2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.print("Bus is driving. ");
    }
}
