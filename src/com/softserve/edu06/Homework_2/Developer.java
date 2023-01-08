package com.softserve.edu06.Homework_2;

import javax.xml.namespace.QName;

public class Developer extends Employee{

    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
//        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name(), age(), salary());
        return String.format("Name: %s, Age: %d, Position: %s, Salary: %.2f.", name(), age(), position, salary());

    }
}
