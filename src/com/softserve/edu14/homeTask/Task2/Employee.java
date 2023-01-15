package com.softserve.edu14.homeTask.Task2;

public class Employee {
    private String employeeName;
    private int employeeAge;

    public Employee(String employeeName, int employeeAge) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "employeeName='" + employeeName + '\'' +
               ", employeeAge=" + employeeAge +
               '}';
    }
}
