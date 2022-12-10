package com.softserve.edu05.homeTask;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    public static void getPosMinAndEven(Scanner scan) {
        int min = Integer.MAX_VALUE;
        int counter = 0;
        int prod = 1;

        System.out.println("Input 5 numbers");
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(scan.nextInt());
        }

        for (int num : arr) {
            if (num % 2 == 0) prod*=num;
            if (num < min) min = num;
            if (num > 0) counter++;
            if (counter == 2) {
                System.out.println("Index of 2 positive number - " + arr.indexOf(num));
                counter = 100;
            }
        }
        System.out.println("Min value - " + min + " product of even numbers - " + prod);


    }

}
