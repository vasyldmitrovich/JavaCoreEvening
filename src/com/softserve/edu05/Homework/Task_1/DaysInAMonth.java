package com.softserve.edu05.Homework.Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class DaysInAMonth {
    public static void daysInAMonth() {
        int[] daysInAMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30 , 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number.");
        int a = scanner.nextInt();
        scanner.close();
        if (a < 0 | a > 12) {
            System.out.println("Incorrect month number.");
        } else {
            System.out.println("Month number " + a + " contains " + (daysInAMonths[a - 1]) + " days.");
        }
    }

    public static void main(String[] args) {
        daysInAMonth();
    }
}
