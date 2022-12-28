package com.softserve.edu05.Homework.Task_2;

import java.util.Scanner;

public class TenIntegers {
    public void tenIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        boolean half = false;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + ':');
            array[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                half = false;
                break;
            } else {
                half = true;
            }
        }

        int sumOfFirstFiveElements = 0;
        for (int i = 0; i < 5; i++) {
            sumOfFirstFiveElements += array[i];
        }
        if (half) {
            System.out.println("Sum of first fives elements is: " + sumOfFirstFiveElements);
        } else {
            int productOfLastFivesElements = 1;
            for (int i = 5; i < array.length; i++) {
                productOfLastFivesElements *= array[i];
            }
            System.out.println("Product of last fives elements is: " + productOfLastFivesElements);
        }
    }

    public static void main(String[] args) {
        TenIntegers tenIntegers = new TenIntegers();
        tenIntegers.tenIntegers();
    }
}
