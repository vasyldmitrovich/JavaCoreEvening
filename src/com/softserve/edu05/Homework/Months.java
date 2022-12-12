package com.softserve.edu05.Homework;

import java.util.Scanner;

/* Ask user to enter the number of month. Read the value and write the number of days in
this month (create array with amount days of each month).*/

public class Months {
    public static void main(String[] args) {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input number: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println(monthDays[n-1]);
    }
}
