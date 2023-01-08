package com.softserve.edu06.PracticalTask_1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Volvo",180,2015),
                new Truck("Mers",160,2014),
                new Sedan("BMW", 240, 2023),
                new Sedan("Opel", 200, 2011)
        };
        cars[0].run();
        cars[0].showInfo();
        cars[0].stop();
        cars[2].run();
        cars[2].showInfo();
        cars[2].stop();

    }
}
