package com.softserve.edu07.HomeTasks;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String name, String employed, String federalTaxIdMember, double fixedMonthlyPayment) {
        super(name, employed);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "\nName: " + getName()+
                ", Federal tax id member: '" + federalTaxIdMember + '\'' +
                ", Average monthly wage: " + calculatePay();
    }

}
