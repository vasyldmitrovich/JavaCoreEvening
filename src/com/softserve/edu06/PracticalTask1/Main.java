package com.softserve.edu06.PracticalTask1;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        Car[] cars = new Car[2];
        cars[0] = new Sedan("Nissan Quashqai", 180, 2019);
        cars[1] = new Truck("Ford F150", 120, 2005);

        for(Car car : cars) {
            System.out.println(car.toString());
            car.run();
            car.stop();
        }
    }

}