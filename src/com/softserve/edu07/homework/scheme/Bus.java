package com.softserve.edu07.homework.scheme;

public class Bus extends GroundVehicle {
    String route;

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
        System.out.println("This vehicle is " + this.getClass().getSimpleName()
                + ", total capacity passengers is " + this.getPassengers() + " and he rides on the " + this.getRoute() + " route");
        System.out.println("-----------------------------------------------------------------------");
    }
}
