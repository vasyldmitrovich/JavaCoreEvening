package com.softserve.edu12.PracticalTask_1;

import java.util.Scanner;

public class Methods {

    public double input() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Input is not a number.");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public void checkIfIsLessThenZero(double a) throws MyException {
        if (a < 0) {
            throw new MyException("Digit can't be less then 0", "777");
        }
    }

    public double squareRectangle(double a, double b) {
        if (a < 0 || b < 0) {
            return 0;
        }
        return a * b;
    }

    public void squareRectangleOutPut() {
        System.out.println("Enter first digit.");
        double a = input();
        System.out.println("Enter second digit.");
        double b = input();
        try {
            checkIfIsLessThenZero(a);
            checkIfIsLessThenZero(b);
        } catch (MyException myException) {
            System.err.println("Caught the exception\nException: " + myException.getMessage() + ", error code: " + myException.getErrorCode());
        } finally {
            double r = squareRectangle(a, b);
            if (a < 0 | b < 0) {
                System.err.println("Bad result: " + r);
            } else {
                System.out.println("Good result: " + r);
            }
        }
    }
}
