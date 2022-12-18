package com.softserve.edu07.homeTask;

public class SalariedEmployee extends Employee implements Payment {
    private int fixedPay;
    private String name;

    public SalariedEmployee(String name, int fixedPay, String employeeID) {
        super(employeeID);
        this.name = name;
        this.fixedPay = fixedPay;
    }

    @Override
    public int calculatePay() {
        return fixedPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name=" + name + '\''+
                ", Salary='" + calculatePay() +
                '}';
    }
}
