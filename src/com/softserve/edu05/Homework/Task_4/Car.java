package com.softserve.edu05.Homework.Task_4;

import com.softserve.edu05.PracticalTask.Task_2.Employee;

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
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void modelByYear(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of production of the car to see the models.");
        int a = scanner.nextInt();
        scanner.close();
        int b = 0;
        while (b < cars.length) {
            if (cars[b].yearOfProduction != a & b == cars.length - 1) {
                System.out.println("There is no department with this number.");
                break;
            } else if (cars[b].yearOfProduction != a) {
                b++;
            } else {
                for (Car car : cars) {
                    if (car.yearOfProduction == a) {
                        System.out.println(car.type);
                    }
                }
                break;
            }
        }
    }
    public static void sortByYear(Car[] cars) {
        int tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction > cars[j].yearOfProduction) {
                    tmp = cars[i].yearOfProduction;
                    cars[i].yearOfProduction = cars[j].yearOfProduction;
                    cars[j].yearOfProduction = tmp;
                }
            }
        }
        System.out.println("Cars sorted by year of release:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
