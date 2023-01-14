package com.softserve.edu07.Homework_2;

public class AppMain {
    public static void main(String[] args) {

        Liner liner = new Liner(13);
        Boat boat = new Boat(17);
        Passengers plane = new Plane(5300);
        FlyingVehicle helicopter = new Helicopter(500, 9000);
        Passengers bus = new Bus("Egypt");
        GroundVehicle motorcycle = new Motorcycle(299);
        GroundVehicle car = new Car("Ferrari");

        System.out.println("------------------LINER------------------");
        liner.setPassengers(600);
        System.out.println("Amount of passengers is: " + liner.passengers() + '.');
        System.out.println("There are " + liner.floors() + "floors on the liner.");
        liner.isSailing();
        System.out.println("\n------------------BOAT------------------");
        boat.setPassengers(10);
        System.out.println("Amount of passengers is: " + boat.passengers() + '.');
        System.out.println("The volume of boat is: " + boat.volume() + '.');
        boat.isSailing();
        System.out.println("\n------------------PLANE------------------");
        System.out.println("AND SO ON...");
        // AND SO ON...
    }
}
