package com.softserve.edu05.PracticalTask.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MainEmployee {

    public static void main(String[] args) throws IOException {
        Employee[] employees;
        employees = new Employee[]{
                new Employee("Yaro", 3600, 101),
                new Employee("Katy", 1111, 101),
                new Employee("Mary", 1200, 200),
                new Employee("John", 2255, 200),
                new Employee("John", 2255, 300),
                new Employee("Mark", 2255, 300),
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter department number:");

        int number = Integer.parseInt(br.readLine());
        if (number != 101 && number != 200 && number != 300) {
            System.out.println("There is no such department, please, try another one.");
        }
        Employee search = null;
        for (Employee empl : employees) {
            if (empl.getDepartment_number() == number) {
                search = empl;
            } else continue;
            System.out.println("The workers of the department: " + search);
        }

        System.out.println("\nEmployees were sorted by salary: ");
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        String elements = Arrays.toString(employees);
        System.out.println(elements);
    }
}
