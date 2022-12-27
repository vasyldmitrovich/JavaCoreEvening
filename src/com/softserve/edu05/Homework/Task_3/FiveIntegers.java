package com.softserve.edu05.Homework.Task_3;

import java.util.Scanner;

public class FiveIntegers {
    public static void fiveIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int productOfAllEvenNumbers = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + ':');
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                productOfAllEvenNumbers *= array[i];
            }
        }
        scanner.close();
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 & count == 2) {
                System.out.println("Position of second positive number:" + (i + 1) + '.'); // position not index
                break;
            } else if (array[i] > 0) {
                count++;
            } else if (i == array.length - 1 & count == 2 & array[i] < 0) {
                System.out.println("There is only one positive number.");
            } else if (i == array.length - 1 & array[i] < 0) {
                System.out.println("There are no positive numbers.");
                productOfAllEvenNumbers = 0;
            }
        }
        int min = array[0];
        int position = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i + 1;
            }
        }
        System.out.println("\nMinimal number is " + min + " on position " + position + '.');
        System.out.println("\nThe product of all entered even numbers: " + productOfAllEvenNumbers);
    }

    public static void main(String[] args) {
        fiveIntegers();
    }
}
