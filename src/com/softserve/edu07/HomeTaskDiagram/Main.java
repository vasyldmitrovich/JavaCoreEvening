package com.softserve.edu07.HomeTaskDiagram;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        Passengers[] passengers = new Passengers[7];

        passengers[0] = new Liner(1000, 2);
        passengers[1] = new Boat(7, 20);
        passengers[2] = new Plane(500, 1000);
        passengers[3] = new Helicopter(20, 8500,4);
        passengers[4] = new Bus(50, "Dnipro-Lviv");
        passengers[5] = new Car(4, "Audi");
        passengers[6] = new Motorcycle(1, 90);

        for (Passengers pas: passengers
             ) {
            System.out.println(pas);
            if (pas instanceof FlyingVehicle){
                ((FlyingVehicle) pas).fly();
            } else if (pas instanceof WaterVehicle) {
               ((WaterVehicle) pas).isSailing();
            } else if (pas instanceof GroundVehicle) {
                ((GroundVehicle) pas).drive();
            }
        }

    }
}
