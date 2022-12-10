package com.softserve.edu05.homeTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CarRealisation extends Car {
    private static ArrayList<Car> arr = new ArrayList<>();

    public CarRealisation(String type, int year, double engineCapacity) {
        super(type, year, engineCapacity);
        arr.add(this);
    }

    public static void certainModelYear(Scanner scan) {
        boolean checkIfPresent = false;
        System.out.println("Input year");
        int year = scan.nextInt();
        for (Car car : arr) {
            if (car.getYear() == year) {
                System.out.println(car);
                checkIfPresent = true;
            }
        }
        if (!checkIfPresent) System.out.println("No car with your year");
    }

    public static void orderCars() {
        arr.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        System.out.println("Sorted by year - " + arr.toString());
    }
}
