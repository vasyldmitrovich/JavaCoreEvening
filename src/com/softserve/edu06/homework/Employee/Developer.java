package com.softserve.edu06.homework.Employee;

public class Developer extends Employee {
    private final String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {

        return String.format("Name: %s, Age: %d, Position: %s, Salary: %.2f.", super.getName(), super.getAge(), position, super.getSalary());
    }
}
