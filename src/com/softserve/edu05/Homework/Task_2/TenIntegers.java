package com.softserve.edu05.Homework.Task_2;

import java.util.Scanner;

public class TenIntegers {
    public static void tenIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + ':');
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int sumOfFirstFiveElements = 0;
        for (int i = 0; i < 5; i++) {
            sumOfFirstFiveElements += array[i];
        }
        if (sumOfFirstFiveElements > 0) {
            System.out.println(sumOfFirstFiveElements);
        } else {
            int productOfLastFivesElements = 1;
            for (int i = 5; i < array.length; i++) {
                productOfLastFivesElements *= array[i];
            }
            System.out.println(productOfLastFivesElements);
        }
    }

    public static void main(String[] args) {
        tenIntegers();
    }
}
