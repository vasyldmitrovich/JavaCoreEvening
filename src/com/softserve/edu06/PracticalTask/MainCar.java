package com.softserve.edu06.PracticalTask;

public class MainCar {
    public static void main(String[] args) {


        Car[] cars = new Car[4];
        cars[0] = new Sedan("sedan", 220, 2012);
        cars[1] = new Sedan("sedan", 240, 2010);
        cars[2] = new Truck("truck", 180, 2007);
        cars[3] = new Truck("truck", 200, 2010);

        for (Car c : cars) {
            c.run();
            c.stop();
        }
    }
}


