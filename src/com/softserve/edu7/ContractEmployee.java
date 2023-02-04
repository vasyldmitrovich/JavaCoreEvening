package com.softserve.edu7;

public class ContractEmployee extends Employee implements Payment {
    int federalTaxIdmember;
    int hourlyRate;
    int workedHours;

    public ContractEmployee(String employeeID, int federalTaxIdmember, int hourlyRate, int workedHours) {
        super(employeeID);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public int calculatePay() {
        return hourlyRate*workedHours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", employeeID='" + employeeID +
                ", average monthly wage=" + calculatePay() + '\'' +
                '}';
    }
}
