package com.softserve.edu12.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            div(scanner.nextDouble(), scanner.nextDouble());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid character");
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Division by zero");
        }
    }

    static void div(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException();
        System.out.println(a / b);
    }

/*    static void realNumber(int start, int and) {
    }*/
}
