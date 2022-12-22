package com.softserve.edu05;

import java.util.Scanner;

/**
 * HOMEWORK
 * Enter 5 integer numbers. Find
 * • position of second positive number;
 * • minimum and its position in the array.
 * Count the product of all entered even numbers
 */
public class Edu05Part5 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int tempCounter = 0;
        int minPosition = 0;
        int min;
        int productAll = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integer numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        min = numbers[0];
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > 0) {
                tempCounter++;
            }
            if (numbers[x] > 0 && tempCounter == 2) {
                System.out.println("position of second positive number is: " + (x + 1));
                //break;
            }

            if (numbers[x] < min) {
                min = numbers[x];
                minPosition = x;
            }
            productAll *= numbers[x];
        }
        if (tempCounter < 2) {
            System.out.println("array does not contain enough positive numbers");

        }
        System.out.println("Minimum is " + min + " on position " + (minPosition + 1));
        System.out.println("Product of all entered even numbers is: " + productAll);


    }
}
