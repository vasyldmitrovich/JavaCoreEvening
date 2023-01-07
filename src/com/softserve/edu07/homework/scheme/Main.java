package com.softserve.edu07.homework.scheme;

public class Main {
    public static void main(String[] args) {
        createWaterVehicle();
    }

    public static void createWaterVehicle() {
        Liner liner = new Liner(2700, 4);
        Boat boat = new Boat(15, 35);
        Plane plane = new Plane(5, 1450);
        Helicopter helicopter = new Helicopter(5, 2000, 3000);
        Bus bus = new Bus(35, "CITY");
        Motorcycle motorcycle = new Motorcycle(2, 120);
        Car car = new Car(4, "Mercedes-Benz s206");

        liner.isSailing();
        boat.isSailing();
        plane.fly();
        plane.land();
        helicopter.fly();
        helicopter.land();
        bus.drive();
        motorcycle.drive();
        car.drive();


    }
}
