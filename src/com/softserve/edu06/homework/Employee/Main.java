package com.softserve.edu06.homework.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 35, 3000);
        Developer developer = new Developer("Alex", 33, "Average Java developer", 5000);

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
