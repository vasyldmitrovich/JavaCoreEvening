package com.softserve.edu05.PracticalTasks;

import java.sql.Array;
import java.util.Scanner;

public class Employee {
    String name;
    int departmentNumber;
    double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alpha", 1, 1000);
        Employee employee2 = new Employee("Beta", 2, 2000);
        Employee employee3 = new Employee("Gamma", 3, 3000);
        Employee employee4 = new Employee("Delta", 4, 4000);
        Employee employee5 = new Employee("Epsilon", 5, 5000);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        System.out.println("Input department number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Employees of a certain department:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == number){
                System.out.println(employees[i]);
            }
        }

        System.out.println();

        Employee tmp;

        for (int i = 0; i < employees.length-1; i++) {
            for (int j = i+1; j < employees.length ; j++) {
                if (employees[i].getSalary()<employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i]=employees[j];
                    employees[j] = tmp;
                }
            }
        }

        for (Employee emp: employees){
            System.out.println(emp);
        }
    }
}
