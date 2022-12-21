package com.softserve.edu07.HomeTasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        createEmployees();
    }

    public static void createEmployees(){
        Employee[] arrayEmployee = new Employee[5];

        arrayEmployee[0] = new SalariedEmployee("Oleg", "cleaner","859647", 100, 160);
        arrayEmployee[1] = new SalariedEmployee("Zlata", "developer","985238", 150.5, 170);
        arrayEmployee[2] = new SalariedEmployee("Nadia", "engineer","123456", 120, 165);
        arrayEmployee[3] = new ContractEmployee("David", "analyst","852", 18000);
        arrayEmployee[4] = new ContractEmployee("Tereza", "manager", "633", 20000);

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arrayEmployee));

        Arrays.sort(arrayEmployee, new Employee.ByAverageMonthlyWage());

        System.out.print("\nSorted array: ");
        System.out.println(Arrays.toString(arrayEmployee));
    }
}
