package com.softserve.edu07.homeTask.Task1;

public abstract class Employee implements Payment{

    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

}
