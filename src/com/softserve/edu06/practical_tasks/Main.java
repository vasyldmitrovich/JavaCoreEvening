package com.softserve.edu06.practical_tasks;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        runCar();
        drawLine();
    }

    private static void runCar() {
        Car[] cars = {new Truck("MAN", 150, 2015),
                new Truck("DAF", 170, 2014),
                new Sedan("Volkswagen", 220, 2019),
                new Sedan("Audi", 230, 2018)};
        for (Car temp : cars) {
            System.out.println(temp);
        }
        System.out.println();
    }

    private static void drawLine() {
        Line[] lines = {new Line(new Point(1, 1), new Point(1, 5)),
                new Line(new Point(3, 7), new Point(7, 10)),
                new ColorLine(new Point(1, 1), new Point(1, 5), Color.GREEN)};
        for (Line temp : lines) {
            temp.print();
        }
    }

}
