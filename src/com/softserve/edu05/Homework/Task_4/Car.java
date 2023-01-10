package com.softserve.edu05.Homework.Task_4;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {}

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "\nType = " + type +
                ". Year of production = " + yearOfProduction +
                ". Engine capacity = " + engineCapacity +
                '.';
    }

    public int inputYearOfProd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of production of the car to see the models.");
        int a = scanner.nextInt();
        scanner.close();
        return a;
    }

    public Car[] modelByYear(Car[] cars) {
        int a = inputYearOfProd();
        int count = 0;
        int i = 0;
        for (Car car : cars) {
            if (car.yearOfProduction == a) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Car[] cars1 = new Car[count];
        for (Car car : cars) {
            if (car.yearOfProduction == a) {
                cars1[i] = car;
                i++;
            }
        }
        return cars1;
    }
    public Car[] sortByYear(Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction > cars[j].yearOfProduction) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        return cars;
    }
}
