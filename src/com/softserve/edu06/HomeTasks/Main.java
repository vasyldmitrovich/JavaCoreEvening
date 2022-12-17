package com.softserve.edu06.HomeTasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){

        createArrayOfBirds();

        System.out.println();
        createEmployee();
    }

    private static void createArrayOfBirds(){
        Bird[] arrayOfBirds = new Bird[4];

        arrayOfBirds[0] = new Eagle("Karphaks");
        arrayOfBirds[1] = new Penguin("Lolo");
        arrayOfBirds[2] = new Chicken("Tutta");
        arrayOfBirds[3] = new Swallow("Spring");

        for (Bird bird: arrayOfBirds
             ) {
            bird.fly();
        }

        System.out.println();
        System.out.println("Array of birds: "+Arrays.toString(arrayOfBirds));
    }

    private static void createEmployee(){
        System.out.println("Employee:");
        Employee empl = new Employee("Bogdan", 23, 30000);
        System.out.println(empl.report());
        Developer dev = new Developer("Olga", 30, 40000,"Average Java developer");
        System.out.println(dev.report());
    }

}
