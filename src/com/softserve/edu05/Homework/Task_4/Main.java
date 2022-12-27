package com.softserve.edu05.Homework.Task_4;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", 1998, 3.5),
                new Car("Opel", 2010, 1.5),
                new Car("Ford", 1998, 2.5),
                new Car("Zaporozhetsk", 2022, 8.5),
        };
        Car.modelByYear(cars);
        System.out.println();
        Car.sortByYear(cars);
    }
}
