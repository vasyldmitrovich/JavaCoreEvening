package com.softserve.edu07.Homework_1;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name) {
        super(employeeId, name);
    }

    public String socialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        double hourlyRate = 15.5;
        int hoursAtMonth = 140;
        return (int)(hourlyRate * hoursAtMonth);
    }
}
