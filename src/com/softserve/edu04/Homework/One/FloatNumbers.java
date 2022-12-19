package com.softserve.edu04.Homework.One;

import java.util.Scanner;

public class FloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        scanner.close();
        if (a >= -5 && a <= 5) {
            System.out.println("First float passed.");
        } else {
            System.out.println("First float failed");
        }
        if (b >= -5 && b <= 5) {
            System.out.println("Second float passed.");
        }else {
            System.out.println("Second float failed");
        }
        if (c >= -5 && c <= 5) {
            System.out.println("Third float passed.");
        }else {
            System.out.println("Third float failed");
        }
    }
}
