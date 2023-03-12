package com.softserve.edu12.practical_tasks.task1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int WIDTH = 0, HEIGHT = 0;

    public static void main(String[] args) {
        scan();

        try {
            System.out.println("Area of a rectangle is: " + squareRectangle(WIDTH, HEIGHT));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int squareRectangle(int a, int b) throws IOException {
        if (a <= 0 || b <= 0)
            throw new ArithmeticException("Negative value side of rectangle");
        return a * b;
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the WIDTH of the rectangle: ");
            WIDTH = scanner.nextInt();

            System.out.print("Enter the HEIGHT of the rectangle: ");
            HEIGHT = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new ArithmeticException("Not an integer entered");

        }
    }
}
