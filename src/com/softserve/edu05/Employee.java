package com.softserve.edu05;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

        private final String name;
        private final int deptNumber;
        private final int salary;
        static ArrayList<Employee> array = new ArrayList<>();
        private static boolean checkDepart = false;


        public Employee (String name, int deptNumber, int salary){
            this.name = name;
            this.deptNumber = deptNumber;
            this.salary = salary;
            array.add(this);
        }
    public Employee (){
        name = "";
        deptNumber = 0;
        salary = 0;
    }
    public String getName() {
        return name;
    }
    public int getDeptNumber(){
        return deptNumber;
    }

    public int getSalary(){
        return salary;
    }

    public static void employeeOfDept() {
        System.out.println("Enter number of department: ");
        Scanner scan = new Scanner(System.in);
        int deptNumber = scan.nextInt();
        for (Employee emp : array) {
            if (emp.getDeptNumber() == deptNumber) {
                System.out.println(emp);
                checkDepart = true;
            }
        }
        if (!checkDepart) System.out.println("Such a department does not exist!");
    }
    public static void salarySort() {
        array.sort((o1, o2) -> o2.getSalary() - o1.getSalary());
        System.out.println("Reduced salary: " + array );

    }

    @Override
    public String toString() {
        String s = "Worker: " + name +
                "Department: " + getDeptNumber() + " " +
                "Salary: " + getSalary();
        return s;
    }
}
