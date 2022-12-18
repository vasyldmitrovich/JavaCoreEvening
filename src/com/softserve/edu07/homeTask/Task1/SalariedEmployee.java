package com.softserve.edu07.homeTask.Task1;

/*Fixed-paid worker*/

import java.util.stream.Stream;

public class SalariedEmployee extends Employee{

    private String name;
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePaid() {
        return this.fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return this.employeeId + " - " + this.name + " - " + this.calculatePaid();
    }
}
