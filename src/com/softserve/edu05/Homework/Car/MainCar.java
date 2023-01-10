package com.softserve.edu05.Homework.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MainCar {
    public static void main(String[] args) throws IOException {
        Car[] cars = {
                new Car(2020, "Sedan", 3.0),
                new Car(2021, "Crossover", 2.6),
                new Car(2022, "Minivan", 1.8),
                new Car(2020, "Sedan", 1.4)

        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the year of production:");

        int year = Integer.parseInt(br.readLine());
        if (year < 2020 || year > 2022) {
            System.out.println("There is no such car in the list , please, try another year of production.");
        }
        Car search;
        for (Car car : cars) {
            if (car.getYearProd() == year) {
                search = car;
            } else continue;
            System.out.println("The cars of this production year: " + search.getType());
        }
        System.out.println("\nCars were sorted by the field year: ");
        Arrays.sort(cars, Comparator.comparing(Car::getYearProd));
        /*Instead nex two line use System.out.println(Arrays.toString(cars));  DONE*/

        System.out.println(Arrays.toString(cars));
    }
}
