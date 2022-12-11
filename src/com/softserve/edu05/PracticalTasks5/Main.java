package com.softserve.edu05.PracticalTasks5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());

        System.out.println("\nInput department number");
        Scanner in = new Scanner(System.in);
        int numD = in.nextInt();
        Employee.belongDepartment(numD, emp1, emp2, emp3, emp4, emp5);

        Employee.arrangeEmployee(emp1, emp2, emp3, emp4, emp5);
    }

}
