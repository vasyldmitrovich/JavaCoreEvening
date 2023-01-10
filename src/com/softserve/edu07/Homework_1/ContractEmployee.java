package com.softserve.edu07.Homework_1;

public class ContractEmployee extends Employee implements Payment {

    private int federalTaxIdMember;

    public ContractEmployee(String employeeId, String name) {
        super(employeeId, name);
    }

    public int federalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return 2200;
    }


}
