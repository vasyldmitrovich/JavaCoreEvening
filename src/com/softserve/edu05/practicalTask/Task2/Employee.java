package com.softserve.edu05.practicalTask.Task2;

public class Employee {

    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, DepartmentNumber departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber.numberOfDepartment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
