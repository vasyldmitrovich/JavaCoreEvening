package com.softserve.edu07.homeTask;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private int numberHours;
    private int hourlyRate;

    public ContractEmployee(String name, int numberHours, int hourlyRate, String employeeID) {
        super(employeeID);
        this.name = name;
        this.numberHours = numberHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int calculatePay() {
        return numberHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", Salary=" + calculatePay() +
                '}';
    }
}
