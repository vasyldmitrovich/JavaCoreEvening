package com.softserve.edu7;

public class SalariedEmployee extends Employee implements Payment{
    String  socialSecurityNumber;
    String name;
    int salary;

    public SalariedEmployee(String employeeID, String socialSecurityNumber, String name, int salary) {
        super(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", average monthly wage=" + calculatePay();
    }
}
