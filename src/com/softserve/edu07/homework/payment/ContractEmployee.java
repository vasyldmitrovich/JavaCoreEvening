package com.softserve.edu07.homework.payment;

public class ContractEmployee extends Employee implements Payment {
    int federalTaxIdMember;
    int fixedPayment;

    public ContractEmployee(String name, int employeeId, int federalTaxIdMember, int fixedPayment) {
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedPayment = fixedPayment;
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int calculatePay() {
        return this.fixedPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee--> " + "Employee Id=" + employeeId + ", Name=" + name + ", Average monthly wage=" + calculatePay();
    }
}
