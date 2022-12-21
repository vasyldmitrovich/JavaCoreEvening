package com.softserve.edu06.MyProjects.PracticalTask1;

import java.util.ArrayList;

/* Roman Sitko. Lesson 6 Practical task 1.
*1. Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
*2. Develop classes Truck and Sedan which extend class Car.
*3. In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.
*/

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        Car[] cars = new Car[2];
        cars[0] = new Sedan("Ford Fiesta", 150, 2001);
        cars[1] = new Truck("Volkswagen Crafter", 120, 2005);

        for(Car car : cars) {
            System.out.println(car.toString());
            car.run();
            car.stop();
        }
    }

}