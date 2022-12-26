package com.softserve.edu07.sort.MyProjects.Homework2;

import java.util.ArrayList;
/*Roman Sitko
* Lesson 7. Homework 2*/
public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run(){
        ArrayList<Passengers> passengers = new ArrayList<>();
        passengers.add(new Liner(100, 5));
        passengers.add(new Boat(7, 1));
        passengers.add(new Plane(50, 1000));
        passengers.add(new Helicopter(10, 1000, 5000));
        passengers.add(new Bus(50, "Lviv-Kyiv"));
        passengers.add(new Motorcycle(2, 200));
        passengers.add(new Car(5, "Skoda Octavia"));

        for(Passengers passenger : passengers) {
            if (passenger instanceof WaterVehicle && passenger instanceof Liner) {
                ((Liner) passenger).isSailing();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Floors: " + ((Liner) passenger).getFloors());
            }
            if (passenger instanceof WaterVehicle && passenger instanceof Boat) {
                ((Boat) passenger).isSailing();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Volume: " + ((Boat) passenger).getVolume());
            }
            if (passenger instanceof FlyingVehicle && passenger instanceof Plane) {
                ((Plane) passenger).fly();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Max Distance: " + ((Plane) passenger).getMaxDistance());
            }
            if (passenger instanceof FlyingVehicle && passenger instanceof Helicopter) {
                ((Helicopter) passenger).fly();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Weight: " + ((Helicopter) passenger).getWeight() +
                        ". Max height: " + ((Helicopter) passenger).getMaxHeight());
            }
            if (passenger instanceof GroundVehicle && passenger instanceof Bus) {
                ((Bus) passenger).drive();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Route: " + ((Bus) passenger).getRoute());
            }
            if (passenger instanceof GroundVehicle && passenger instanceof Motorcycle) {
                ((Motorcycle) passenger).drive();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Max speed: " + ((Motorcycle) passenger).getMaxSpeed());
            }
            if (passenger instanceof GroundVehicle && passenger instanceof Car) {
                ((Car) passenger).drive();
                System.out.println("Passengers: " + passenger.getPassengers() +
                        ". Model " + ((Car) passenger).getModel());
            }
        }



    }
}
