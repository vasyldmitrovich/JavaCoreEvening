package com.softserve.edu06.practicalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        runCar();
        runLine();
    }

    public static void runCar() {
        ArrayList<Car> arr = new ArrayList<>();
        Car car1 = new Truck("Tesla", 270, 2022);
        Car car2 = new Sedan("Mazda", 210, 2018);
        arr.add(car1);
        arr.add(car2);
        for (Car car : arr) {
            System.out.println(car.toString());
        }
        System.out.println();
    }

    public static void runLine() {
        ArrayList<Line> arr = new ArrayList<>();
        arr.add(new ColorLine(new Point(1, 2), new Point(2, 3), "Red"));
        arr.add(new Line(new Point(3, 4), new Point(4, 3)));
        for (Line line : arr) {
            System.out.println(line);
            line.print();
        }
        System.out.println();
    }
}
