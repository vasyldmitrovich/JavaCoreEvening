package com.softserve.edu05.PracticalTask.Task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Oleg", 1, 1111),
                new Employee("Igor", 2, 2222),
                new Employee("Yura", 2, 3333),
                new Employee("Nazar", 1, 4444),
                new Employee("Dima", 3, 5555)
        };
        Employee.employeeDepartment(employees);
        System.out.println();
        Employee.descendingSalary(employees);
    }
}
