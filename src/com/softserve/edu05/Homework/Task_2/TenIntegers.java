package com.softserve.edu05.Homework.Task_2;

import java.util.Scanner;

public class TenIntegers {

    public int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + ':');
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public boolean posOrNegative(int[] array) {
        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfFirstFiveElement(int[] array) {
        int sumOfFirstFiveElements = 0;
        for (int i = 0; i < 5; i++) {
            sumOfFirstFiveElements += array[i];
        }
        return sumOfFirstFiveElements;
    }

    public int productOfLastFivesElement(int[] array) {
        int productOfLastFivesElements = 1;
        for (int i = 5; i < array.length; i++) {
            productOfLastFivesElements *= array[i];
        }
        return productOfLastFivesElements;
    }
    public String tenIntegers() {
        int[] array = inputArray();

        if (posOrNegative(array)) {
            return  "Sum of first fives elements is: " + sumOfFirstFiveElement(array);
        } else {
            return  "Product of last fives elements is: " + productOfLastFivesElement(array);
        }
    }

    public static void main(String[] args) {
        TenIntegers tenIntegers = new TenIntegers();
        System.out.println(tenIntegers.tenIntegers());
    }
}
