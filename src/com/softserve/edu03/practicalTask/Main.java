package com.softserve.edu03.practicalTask;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        //default constructor
        Employee employee1 = new Employee();
        employee1.setName("Vladyslav");
        employee1.setHours(10);
        employee1.setRate(10.5);

        //constructor with one param
        Employee employee2 = new Employee("Andriy");
        employee2.setHours(14);
        employee2.setRate(14.5);

        //constructor with three params
        Employee employee3 = new Employee("Bogdan", 9.5, 16);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Salary of " + employee1.getName() + ": " + employee1.getSalary());
        System.out.println("Salary of " + employee2.getName() + ": " + employee2.getSalary());
        System.out.println("Salary of " + employee3.getName() + ": " + employee3.getSalary());

        //test getBonuses() method
        System.out.println(employee3.getName() + " gets bonuses: " + employee3.getBonuses());

        System.out.println("Total sum: " + Employee.getTotalSum());

    }
}
