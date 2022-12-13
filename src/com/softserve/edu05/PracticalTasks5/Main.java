package com.softserve.edu05.PracticalTasks5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        int[] intArray = {10, 7, -8, 45, 4, -12, 0, 1, 15, -6};

        System.out.println("My array: "+ Arrays.toString(intArray));

        MyArrays.findBiggest(intArray);

        MyArrays.findSumPositiveNumbers(intArray);

        MyArrays.findAmountNegativeNumbers(intArray);

        System.out.println();

        Employee emp1 = new Employee("Kozachenko", 101, 12000);
        Employee emp2 = new Employee("Kovalenko", 103, 15000);
        Employee emp3 = new Employee("Mironenko", 105, 11500);
        Employee emp4 = new Employee("Vasilenko", 101, 11500);
        Employee emp5 = new Employee("Svitlenko", 103, 15500);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);

        System.out.println("\nInput department number");

        int numD = myScanner.scan.nextInt();
        Employee.belongDepartment(numD, emp1, emp2, emp3, emp4, emp5);

        Employee.arrangeEmployee(emp1, emp2, emp3, emp4, emp5);
    }
}
