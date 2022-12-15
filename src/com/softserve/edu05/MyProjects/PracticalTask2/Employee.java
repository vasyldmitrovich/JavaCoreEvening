package com.softserve.edu05.MyProjects.PracticalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String name;
    private int departmentNum;
    private float salary;

    public Employee() {
        name = "";
        departmentNum = 0;
        salary = 0.0f;
    }

    public Employee (String name, int departmentNum, float salary) {
        this.name = name;
        this.departmentNum = departmentNum;
        this.salary = salary;
    }

    public static void outputNameByDep (Employee[] employees) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input number of department from 1 to 3: ");
        int depNum = Integer.parseInt(br.readLine());

        // I don't know how to use exception
        if (depNum < 1 && depNum > 3) {
            throw new IOException("Input Department is no correct");
        }

        System.out.print("Names is: ");
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].departmentNum == depNum) {
                System.out.print(employees[i].name + ", ");
            }
        }
    }

    public static void orderBySal (Employee[] employees) {
        boolean isSorted = false;
        float tmp;
        System.out.println("\nSorting in descending order: ");

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].salary > employees[i + 1].salary) {
                    isSorted = false;
                    tmp = employees[i + 1].salary;
                    employees[i + 1].salary = employees[i].salary;
                    employees[i].salary = tmp;
                }
            }
        }

        for (int i = employees.length - 1; i >= 0; i--) {
            System.out.println("Salary " + i + " = " + employees[i].salary);
        }
    }
}

