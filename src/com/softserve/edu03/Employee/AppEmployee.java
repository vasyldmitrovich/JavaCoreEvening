package com.softserve.edu03.Employee;

public class AppEmployee {
    public static void main(String [] args) {
        Employee employee1 = new Employee("Olena", (float) 7.9, 10);
        Employee employee2 = new Employee("Olha", (float) 6.4, 8);
        Employee employee3 = new Employee("Petro", (float) 9.0F, 7);
        employee1.getSalary();
        employee1.getBonuses();
        employee2.getSalary();
        employee2.getBonuses();
        employee3.getSalary();
        employee3.getBonuses();
        System.out.println("The total salary of all workers: " + Employee.totalSum);
    }
}
