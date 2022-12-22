package com.softserve.edu05;

import java.util.Scanner;

/**
 * HOMEWORK
 * Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or
 * product of last 5 element in the other case
 */
public class Edu05Part4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 integer numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (numbers[0] > 0 & numbers[1] > 0 & numbers[2] > 0 & numbers[3] > 0 & numbers[4] > 0) {
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            System.out.println("sum of first 5 elements: " + sum);
        } else {

            for (int i = 5; i < 10; i++) {
                product *= numbers[i];

            }
            System.out.println("product of last 5 element: " + product);
        }


    }
}
