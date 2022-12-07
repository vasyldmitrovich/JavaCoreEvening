package com.softserve.edu04.practicalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumber {
    public static void oddNumbers() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int counter = 0;

        System.out.println("Input 3 numbers");

        for (int i = 0; i < 3; i++) {
            arr.add(scan.nextInt());
        }

        for (int number : arr) {
            if (number % 2 == 0) {
                arr1.add(number);
                counter++;
            }
        }
        System.out.println("Odd - " + arr1 + " | quantity - " + counter);
    }
}
