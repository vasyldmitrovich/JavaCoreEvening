package com.softserve.edu06.PracticalTasks;

import com.softserve.edu06.PracticalTasks.Cars.Car;
import com.softserve.edu06.PracticalTasks.Cars.Sedan;
import com.softserve.edu06.PracticalTasks.Cars.Truck;
import com.softserve.edu06.PracticalTasks.Lines.ColorLine;
import com.softserve.edu06.PracticalTasks.Lines.Line;
import com.softserve.edu06.PracticalTasks.Lines.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void createAndPrintCars(){
        Car[] arrayCars = new Car[5];

        arrayCars[0] = new Sedan("Audi A5",200, 2020);
        arrayCars[1] = new Sedan("Honda Accord",180, 2018);
        arrayCars[2] = new Sedan("Fiat Mondeo",120, 1980);
        arrayCars[3] = new Truck("Toyota Tundra",150, 2018, "pickup");
        arrayCars[4] = new Truck("Volkswagen Meteor",140, 2020, "tractor");

        System.out.println("Array of cars"+Arrays.toString(arrayCars));
    }

    public static void createAndPrintLines(){
        Line[] arrayLines = new Line[5];
        arrayLines[0] = new Line(new Point(0,1), new Point(0,15));
        arrayLines[1] = new ColorLine(new Point(0,10), new Point(5,15), "green");
        arrayLines[2] = new Line(new Point(10,10), new Point(15,15));
        arrayLines[3] = new ColorLine(new Point(-2,0), new Point(7,9), "orange");
        arrayLines[4] = new Line(new Point(7,3), new Point(20,5));

        System.out.println("Array of lines: "+Arrays.toString(arrayLines));
    }
    public static void go(){

        createAndPrintCars();

        System.out.println();

        createAndPrintLines();
    }
}
