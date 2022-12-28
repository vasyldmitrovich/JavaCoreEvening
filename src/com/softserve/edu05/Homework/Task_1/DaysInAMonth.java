package com.softserve.edu05.Homework.Task_1;

import java.util.Scanner;

public class DaysInAMonth {
    public String daysInAMonth() {
        int[] daysInAMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30 , 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number.");
        int a = scanner.nextInt();
        scanner.close();
        if (a < 0 | a > 12) {
            return  "Incorrect month number.";
        } else {
            return  "Month number " + a + " contains " + (daysInAMonths[a - 1]) + " days.";
        }
    }

//    public static void main(String[] args) {
//        System.out.println(daysInAMonth());
//    }
}
