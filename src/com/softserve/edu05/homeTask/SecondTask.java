package com.softserve.edu05.homeTask;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondTask {
    public static void firstFiveSum(Scanner scan) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean checkPositive = false;
        int sum = 0;
        int multi = 1;
        System.out.println("Input 10 integer numbers");

        for (int i = 0; i < 10; i++) {
            arr.add(scan.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            if (arr.get(i) > 0) {
                sum += arr.get(i);
            } else {
                checkPositive = true;
                for (int j = 5; j < 10; j++) {
                    multi *= arr.get(j);
                }
            }
        }
        if (checkPositive) System.out.println("Your fist 5 numbers are not positive, product of 5 last is - " + multi);
        else System.out.println("Sum - " + sum);
    }
}
