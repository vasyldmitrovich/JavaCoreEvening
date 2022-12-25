package com.softserve.edu07.sort.MyProjects.Homework1;

public class ContractEmployee extends Employee implements Payment {

    private int countHours;
    private float payForHour;
    private  String federalTaxIdmember;

    public ContractEmployee(String employeeId,String name, int countHours, float payForHour, String federalTaxIdmember) {
        super(employeeId, name);
        this.countHours = countHours;
        this.payForHour = payForHour;
        this.federalTaxIdmember = federalTaxIdmember;
        super.setSalary(calculatePay());
    }

    @Override
    public float calculatePay() {
        return countHours * payForHour;
    }

    @Override
    public String toString() {
        return "\n\tContractEmployee: {employeeId: " + super.getEmployeeId() +
                ", name: " + super.getName() +
                ", salary is: " + calculatePay() +
                ", federalTaxIdmember: " + federalTaxIdmember + "}";
    }
}
