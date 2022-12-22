package com.softserve.edu05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * HOMEWORK
 * Create class Car with fields type, year of production and engine capacity. Create and
 * initialize four instances of class Car. Display cars
 * • certain model year (enter year in the console);
 * • ordered by the field year.
 */
public class Edu05Part6 {
    public static void main(String[] args) {
        Car[] car = new Car[4];

        car[0] = new Car("Hatchback", 2015, 2500);
        car[1] = new Car("Sedan", 2010, 1400);
        car[2] = new Car("SUV", 2019, 3500);
        car[3] = new Car("Coupe", 2005, 2000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year of manufacture of the machine ");
        int year = scanner.nextInt();
        for (Car value : car) {
            if (year == value.yearProduction) {
                System.out.println(value);
            }

        }

        Car carTemp;

        for (Car value : car) {
            for (int i = 1; i < car.length; i++) {
                if (car[i].yearProduction < car[i - 1].yearProduction) {
                    carTemp = car[i];
                    car[i] = car[i - 1];
                    car[i - 1] = carTemp;
                }
            }
        }


        System.out.println(Arrays.toString(car));
    }
}

class Car {
    String type;
    int yearProduction;
    int engineCapacity;

    public Car(String type, int yearProduction, int engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return type + ", year of production = " + yearProduction + ", engine capacity = " + engineCapacity + "||";
    }
}
