package com.softserve.edu07.sort.MyProjects.Homework2;

import java.util.ArrayList;
/*Roman Sitko
* Lesson 7. Homework 2*/
public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run(){
        ArrayList<WaterVehicle> waterVehicles = new ArrayList<>();
        waterVehicles.add(new Liner(100, 5));
        waterVehicles.add(new Boat(7, 1));

        ArrayList<FlyingVehicle> flyingVehicles = new ArrayList<>();
        flyingVehicles.add(new Plane(50, 1000));
        flyingVehicles.add(new Helicopter(10, 1000, 5000));

        ArrayList<GroundVehicle> groundVehicles = new ArrayList<>();
        groundVehicles.add(new Bus(50, "Lviv-Kyiv"));
        groundVehicles.add(new Motorcycle(2, 200));
        groundVehicles.add(new Car(5, "Skoda Octavia"));

        for(WaterVehicle waterVehicle : waterVehicles) {
            if (waterVehicle instanceof Liner) {
                waterVehicle.isSailing();
                System.out.println("Passengers: " + waterVehicle.getPassengers() +
                        ". Floors: " + ((Liner) waterVehicle).getFloors());
            }
            if (waterVehicle instanceof Boat) {
                waterVehicle.isSailing();
                System.out.println("Passengers: " + waterVehicle.getPassengers() +
                        ". Volume: " + ((Boat) waterVehicle).getVolume());
            }
        }

       // output FlyingVehicle...


        for(GroundVehicle groundVehicle : groundVehicles) {
            if (groundVehicle instanceof Bus) {
                groundVehicle.drive();
                System.out.println("Passengers: " + groundVehicle.getPassengers() +
                        ". Route: " + ((Bus) groundVehicle).getRoute());
            }
            if (groundVehicle instanceof Motorcycle) {
                groundVehicle.drive();
                System.out.println("Passengers: " + groundVehicle.getPassengers() +
                        ". MaxSpeed: " + ((Motorcycle) groundVehicle).getMaxSpeed());
            }
            if (groundVehicle instanceof Car) {
                groundVehicle.drive();
                System.out.println("Passengers: " + groundVehicle.getPassengers() +
                        ". Model: " + ((Car) groundVehicle).getModel());
            }
        }




    }
}
