package com.softserve.edu05.PracticalTask.Task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void employeeDepartment(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the department number to see the members of it.");
        int a = scanner.nextInt();
        scanner.close();
        int b = 0;
        while (b < employees.length) {
            if (employees[b].departmentNumber != a & b == employees.length - 1) {
                System.out.println("There is no department with this number.");
                break;
            } else if (employees[b].departmentNumber != a) {
                b++;
            } else {
                for (Employee employee : employees) {
                    if (employee.departmentNumber == a) {
                        System.out.println(employee);
                    }
                }
                break;
            }
        }
    }


    public static void descendingSalary(Employee[] employees) {
        int tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].salary < employees[j].salary) {
                    tmp = employees[i].salary;
                    employees[i].salary = employees[j].salary;
                    employees[j].salary = tmp;
                }
            }
        }
        System.out.println("Workers in order of salary reduction:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ". Department number: " + departmentNumber + ". Salary: " + salary + '.';
    }
}
