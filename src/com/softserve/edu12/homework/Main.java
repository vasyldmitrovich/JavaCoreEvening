package com.softserve.edu12.homework;

import java.util.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers to divide");

            div(scanner.nextDouble(), scanner.nextDouble());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid character");
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Division by zero");
        }


        try {
            realNumber(1, 100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void div(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException();
        System.out.println(a / b);
    }

    static void realNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[10];


        for (int i = 0; i < 10; i++) {

            System.out.print("Enter integer number: ");
            int x = scanner.nextInt();
            if (start <= x & x <= end) {
                mas[i] = x;
            } else {
                throw new RuntimeException("The number is not in the given range");
            }
        }
        Arrays.sort(mas);
        for (int s : mas) {
            System.out.print(s + ", ");
        }

    }

}
