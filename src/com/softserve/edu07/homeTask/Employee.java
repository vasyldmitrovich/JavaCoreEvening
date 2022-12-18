package com.softserve.edu07.homeTask;

public abstract class Employee implements Payment {
    private String employeeID;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

}
