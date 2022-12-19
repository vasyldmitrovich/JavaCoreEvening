package com.softserve.edu04.Homework.One;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;
        int min;
        if (a > b & a > c) {
            max = a;
            System.out.println("Max number is: " + max);
        }
        if (b > a & b > c) {
            max = b;
            System.out.println("Max number is: " + max);
        }
        if (c > a & c > b) {
            max = c;
        System.out.println("Max number is: " + max);
        }
        if (a < b & a < c) {
            min = a;
            System.out.println("Min number is: " + min);
        }
        if (b < a & b < c) {
            min = b;
            System.out.println("Min number is: " + min);
        }
        if (c < a & c < b) {
            min = c;
            System.out.println("Min number is: " + min);
        }
    }
}
