package com.softserve.edu7.Passengers;

public class MainPassengers {
    public static void main(String[] args) {
        Bus bus = new Bus(40, "Center-West");
        bus.drive();
        Helicopter helicopter = new Helicopter(4, 500, 2000);
        helicopter.setPassengers(5);
        helicopter.fly();
        helicopter.land();
        Liner liner = new Liner(500, 3);
        System.out.println("There are " + liner.getPassengers() + " passengers in cruise");
        liner.isSailing();
    }
}
