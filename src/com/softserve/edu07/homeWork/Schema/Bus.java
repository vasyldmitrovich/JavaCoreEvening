package com.softserve.edu07.homeWork.Schema;

public class Bus extends GroundVehicle {
    public  String route;
    public Bus(String route, int passengers){
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    public void drive(){
        System.out.println("Маршрут автобуса: " + route + ". В автобусі " + passengers + " пасажирів.");
    }
}
