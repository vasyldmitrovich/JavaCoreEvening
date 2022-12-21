package com.softserve.edu07.HomeTasks;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String name, String employed, String socialSecurityNumber, double hourlyRate, int numberOfHoursWorked) {
        super(name, employed);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "\nName: " + getName()+
                ", Social security number: '" + socialSecurityNumber + '\'' +
                ", Average monthly wage: " + calculatePay();
    }

}
