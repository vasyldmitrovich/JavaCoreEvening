package com.softserve.edu06.homeTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        runBird();
        runEmployee();
    }

    public static void runBird() {
        Bird bird1 = new Eagle(true, false);
        Bird bird2 = new Penguin(false, false);
        ArrayList<Bird> arr = new ArrayList<>();
        arr.add(bird1);
        arr.add(bird2);

        for (Bird bird : arr) {
            bird.fly();
            System.out.println(bird);
        }

        System.out.println();
    }

    public static void runEmployee() {
        Employee emp = new Developer("Jack", 30, "Java dev", 32000);
        Employee emp1 = new Employee("Mike", 25, 19000);
        System.out.println(emp.report());
        System.out.println(emp1.report());
    }
}
