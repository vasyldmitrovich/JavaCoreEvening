package com.softserve.edu12.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.softserve.edu12.Task1.Main.squareRectangle;

public class Rectangle {
    public static void rectangle() {
        int a = 0;
        int b = 0;


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value a: ");
            a = scanner.nextInt();
            System.out.println("Enter the value b: ");
            b = scanner.nextInt();
        } catch (
                InputMismatchException e) {
            System.out.println("Enter a numeric value: ");
        }


        try {
            int square = squareRectangle(a, b);
            System.out.println(square);
        } catch (NegativeNumber e) {
            System.out.println(e.getMessage());
        }
    }
}