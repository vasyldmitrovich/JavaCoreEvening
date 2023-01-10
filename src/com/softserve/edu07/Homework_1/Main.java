package com.softserve.edu07.Homework_1;

import java.util.Arrays;

import static com.softserve.edu07.Homework_1.Employee.sort;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new SalariedEmployee("ID-450","Oleg"),
                new ContractEmployee("ID-453","Olya"),
                new SalariedEmployee("ID-451","Dima"),
                new ContractEmployee("ID-454","Vika"),
                new SalariedEmployee("ID-452","Sasha"),
                new ContractEmployee("ID-455","Marik")
        };
        System.out.println(Arrays.toString(employees));
        sort(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println("\nOutput the employee ID, name, and the average monthly wage for all elements of the list.");
        for (Employee employee : employees) {
            if (employee instanceof Payment) {
                System.out.println(employee.info() + ((Payment) employee).calculatePay());
            }
        }
    }
}
