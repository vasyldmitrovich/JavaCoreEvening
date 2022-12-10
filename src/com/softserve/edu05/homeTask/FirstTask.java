package com.softserve.edu05.homeTask;

import java.util.Scanner;

public class FirstTask {
    public static void checkMonth(Scanner scan) {
        System.out.println("Input number of month");
        int month = scan.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 39, 31, 30, 31};
        System.out.println(days[month - 1] + " days in your month");
    }
}
