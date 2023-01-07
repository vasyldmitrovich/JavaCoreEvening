package com.softserve.edu07.homework.payment;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    int hourlyRate;
    int numOfHoursWork;

    public SalariedEmployee(String name, int employeeId, String socialSecurityNumber, int hourlyRate, int numOfHoursWork) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numOfHoursWork = numOfHoursWork;
        this.employeeId = employeeId;
        this.name = name;

    }
    @Override
    public int calculatePay() {
        return this.hourlyRate * this.numOfHoursWork;
    }

    @Override
    public String toString() {
        return "SalariedEmployee--> " + "Employee Id=" + employeeId + ", Name=" + name +", Average monthly wage="+ calculatePay();
    }

}
