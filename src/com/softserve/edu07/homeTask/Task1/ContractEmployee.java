package com.softserve.edu07.homeTask.Task1;

/*Hourly-paid worker*/

public class ContractEmployee extends Employee{

    private String name;
    private int numberOfHoursWorked;
    private double hourlyRate;

    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, String name, double hourlyRate , int numberOfHoursWorked, String federalTaxIdmember){
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.name = name;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePaid() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return this.employeeId + " - " + this.name + " - " + this.calculatePaid();
    }
}
