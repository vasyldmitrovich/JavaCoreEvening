package com.softserve.edu04.practicalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumber {
    public static void oddNumbers() {
        /*For scanner create own method, that method have only one function
        * You send message in that method
        * he take that message and show user
        * after that read message from keyword
        * and return value
        * after that you can use there that value*/
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
