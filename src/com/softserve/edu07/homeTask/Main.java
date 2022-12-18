package com.softserve.edu07.homeTask;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        runEmployee();
        runBoats();
    }

    public static void runEmployee() {
        Employee emp = new ContractEmployee("Mike", 200, 15, "AAJSJ12");
        Employee emp1 = new SalariedEmployee("Jake", 2500, "ASDAJSJ12");
        Employee emp2 = new ContractEmployee("Chris", 200, 14, "AAASFDQJSJ12");

        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(emp);
        arr.add(emp1);
        arr.add(emp2);
        arr.sort((o1, o2) -> -o1.calculatePay() + o2.calculatePay());
        System.out.println("Sorted by descending salary array :");
        System.out.println(arr);
    }

    public static void runBoats() {
        Liner liner = new Liner();
        liner.setPassengers(20);
        System.out.println(liner.getPassengers() + " - passengers in liner");
        Helicopter helicopter = new Helicopter();
        helicopter.fly();
        Car car = new Car();
        car.drive();
        car.setPassengers(4);
        System.out.println(car.getPassengers() + " - passengers in car");


    }
}
