package com.softserve.edu05.practicalTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;
    static ArrayList<Employee> arr = new ArrayList<>();
    private static boolean checkDepart = false;


    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        arr.add(this);
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }


    public static void departmentCheck() {
        System.out.println("Input department number");
        Scanner scan = new Scanner(System.in);
        int departmentNumber = scan.nextInt();
        for (Employee emp : arr) {
            if (emp.getDepartmentNumber() == departmentNumber) {
                System.out.println(emp);
                checkDepart = true;
            }
        }
        if (!checkDepart) System.out.println("There is no employee in your department");
    }

    public static void sortEmployee() {
        arr.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        System.out.println("Sorted by salary");
        System.out.println(arr);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

}

