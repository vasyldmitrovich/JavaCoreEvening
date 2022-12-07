package com.softserve.edu04.Homework.Task1;

public class IntegerNumbers {
    // read 3 integer numbers and write max and min of them;
    public static void main(String[] args) {

        int[] intNumbers = {58, -300, 159};
        int max = intNumbers[0];
        int min = intNumbers[0];

        for (int n : intNumbers) {
            if (n > max)
                max = n;
        }
        System.out.println("The max number is " + max);

        for (int n : intNumbers) {
            if (n <= min)
                min = n;
        }
        System.out.println("The min number is " + min);
    }
}
