package com.softserve.edu05;

/**
 * PRACTICAL TASK
 * Create an array of ten integers. Display
 * • the biggest of these numbers;
 * • the sum of positive numbers in the array;
 * • the amount of negative numbers in the array.
 * What values there are more: negative or positive?
 */
public class Edu05Part1 {
    public static void main(String[] args) {

        int[] array = {-10, 5, 7, -6, 11, 0, -4, 3, 18, 2};
        int maxNum = 0, sumPositiveNum = 0, amountNegNum = 0, amountPosNum = 0;

        for (int certainNum : array) {
            if (maxNum < certainNum)
                maxNum = certainNum;

            if (certainNum > 0)
                sumPositiveNum += certainNum;

            if (certainNum < 0)
                amountNegNum++;

            if (certainNum > 0)
                amountPosNum++;

        }

        System.out.println("The biggest of these numbers is: " + maxNum);
        System.out.println("The sum of positive numbers in the array is: " + sumPositiveNum);
        System.out.println("The amount of negative numbers in the array is:" + amountNegNum);

        if (amountPosNum > amountNegNum) {
            System.out.println("More positive numbers");
        } else if (amountNegNum > amountPosNum) {
            System.out.println("More negative numbers");
        } else {
            System.out.println("Positive and negative numbers are equal ");
        }
    }
}
