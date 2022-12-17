package com.softserve.edu05.Homework;

public class TenNumbers {
    /*Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or
product of last 5 element in the other case */
    public static void main(String[] args) {

        int[] Numbers = {5, 1, 2, -2, 1, 10, 11, 10, 10, 10};

        int sum = 0;

        int prod = 1;

        boolean positive = true;

        for (int i = 0; i < 5; i++) {
            int j = Numbers[i];
            if (j > 0) sum += j;

            else {
                positive = false;
                for (int n = 5; n < 10; n++) {
                    prod *= Numbers[n];
                }
            }
        }
        if (positive) {
            System.out.println(sum);
        } else {
            System.out.println(prod);
        }
    }
}










