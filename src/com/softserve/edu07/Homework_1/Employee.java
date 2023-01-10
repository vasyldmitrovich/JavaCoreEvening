package com.softserve.edu07.Homework_1;

import java.util.Comparator;

public class Employee {

    private String employeeId;
    private String name;

    public Employee() {
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String employeeId() {
        return employeeId;
    }

    public String info() {
        return employeeId + ". Employee name = " + name + ". Employee monthly salary = ";
    }

    public static void sort(Employee[] employees) {
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i] instanceof Payment & employees[j] instanceof Payment) {
                    if (((Payment) employees[i]).calculatePay() < ((Payment) employees[j]).calculatePay()) {
                        tmp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = tmp;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
