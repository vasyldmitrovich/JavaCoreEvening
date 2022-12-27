package com.softserve.edu05.PracticalTask.Task_1;

public class ArrayOfIntegers {
    public static void main(String[] args) {
        int[] array = new int[] {-1111, 2 , -7, 4, -111, -18, -17, -111, -13, -999};
        System.out.println(biggestNumber(array));
        System.out.println(sumOfPositiveNumbers(array));
        System.out.println(amountOfNegativeNumbers(array));
        System.out.println(whichIsMore(array));
    }

    public static int biggestNumber(int[] array) {
        int biggestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }
        return biggestNumber;
    }

    public static int sumOfPositiveNumbers(int[] array) {
        int sum = 0;
        for (int a : array) {
            if (a >= 0) {
                sum += a;
            }
        }
        return sum;
    }

    public static int amountOfNegativeNumbers(int[] array) {
        int count = 0;
        for (int a : array) {
            if (a < 0) {
                count++;
            }
        }
        return count;
    }

    public static String whichIsMore(int[] array) {
        int positive = 0;
        int negative = 0;
        for (int a : array) {
            if (a > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        return positive > negative ? "There are more positive numbers than negative numbers." : "There are more negative numbers than positive numbers. ";
    }
}
