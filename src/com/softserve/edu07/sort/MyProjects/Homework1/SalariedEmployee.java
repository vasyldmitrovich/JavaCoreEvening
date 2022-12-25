package com.softserve.edu07.sort.MyProjects.Homework1;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, float salary, String socialSecurityNumber) {
        super(employeeId, name);
        super.setSalary(salary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public float calculatePay() {

        return super.getSalary();
    }

    @Override
    public String toString() {
        return "\n\tSalariedEmployee: {employeeId: " + super.getEmployeeId() +
                ", name: " + super.getName() +
                ", salary: " + calculatePay() +
                ", socialSecurityNumber: " + socialSecurityNumber + "}";
    }
}
