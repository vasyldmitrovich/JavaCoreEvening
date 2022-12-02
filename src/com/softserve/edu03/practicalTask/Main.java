package com.softserve.edu03.practicalTask;


public class Main {

    public static void main(String[] args) {
        Employee Dan = new Employee("Dan", 5, 20);
        Employee Mike = new Employee("Mike", 7, 10);
        Employee Jake = new Employee("Jake", 1, 3);

        System.out.println("Salary of all workers - " + Employee.getTotalSum());
    }
}
