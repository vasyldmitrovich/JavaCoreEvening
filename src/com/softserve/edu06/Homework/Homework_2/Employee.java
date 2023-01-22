package com.softserve.edu06.Homework.Homework_2;

public class Employee {
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public double salary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: %.2f.", name, age, salary);
    }
}
