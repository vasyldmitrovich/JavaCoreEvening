package com.softserve.edu05.Homework.Task_3;

import java.util.Scanner;

public class FiveIntegers {

    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + ':');
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int positionOfSecPosInt(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        if (count == 0) {
            return -2;
        }
        return -1;
    }

    public int minNum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int minPos(int[] array) {
        int min = array[0];
        int position = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i + 1;
            }
        }
        return position;
    }

    public int productOfAllEvenNumbers(int[] array) {
        int productOfAllEvenNumbers = 1;
        for (int a : array) {
            if (a > 0) {
                productOfAllEvenNumbers *= a;
            }
        }
        return productOfAllEvenNumbers;
    }
    public void fiveIntegers(){
        int[] array = inputArray();
        if (positionOfSecPosInt(array) > 0) {
            System.out.println("Position of second positive number: " + (positionOfSecPosInt(array) + 1) + '.'); // position not index
        } else if (positionOfSecPosInt(array) == -1) {
            System.out.println("There is only one positive number.");
        } else if (positionOfSecPosInt(array) == -2) {
            System.out.println("There are no positive numbers.");
        }
        System.out.println("\nMinimal number is " + minNum(array) + " on position " + minPos(array) + '.');
        System.out.println("\nThe product of all entered even numbers: " + productOfAllEvenNumbers(array));
    }

    public static void main(String[] args) {
        FiveIntegers fiveIntegers = new FiveIntegers();
        fiveIntegers.fiveIntegers();
    }
}
