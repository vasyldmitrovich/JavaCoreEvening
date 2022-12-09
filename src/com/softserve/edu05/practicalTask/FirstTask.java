package com.softserve.edu05.practicalTask;

import java.util.Random;

public class FirstTask {
    static Random random = new Random();

    public static void arrayFunctions() {
        int sumPositive = 0;
        int counterNEgative = 0;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + random.nextInt(21);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num : arr) {
            max = num > max ? num : max;
        }

        for (int num : arr) {
            counterNEgative = num < 0 ? ++counterNEgative : counterNEgative;
        }

        for (int num : arr) {
            sumPositive = num > 0 ? sumPositive += num : sumPositive;
        }
        System.out.println("Max value - " + max + ", sum of positive numbers - " + sumPositive + ", amount of negative numbers - " + counterNEgative);

    }
}
