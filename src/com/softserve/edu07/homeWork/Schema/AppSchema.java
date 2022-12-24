package com.softserve.edu07.homeWork.Schema;

public class AppSchema {
    public static void main(String[] args) {

        GroundVehicle [] k = {new Bus("Lviv-Odesa", 27),
                              new Car("BMW", 5),
                              new Motorcycle(150, 2)};

        for(GroundVehicle i: k){
            i.drive();
        }

        FlyingVehicle [] n = {new Plane(300000, 250),
                              new Helicopter(2000, 20000, 75)
        };

        for (FlyingVehicle l: n){
            l.fly();
        }

        WaterVehicle [] m = {new Boat(150, 5),
        new Liner(4, 2000)};

        for (WaterVehicle v: m){
            v.isSailing();
        }
    }
}
