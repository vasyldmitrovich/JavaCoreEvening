package com.softserve.edu12.homeTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        div();
        System.out.println(readNumber(1, 10));
    }

    static void div() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (b == 0) throw new ArithmeticException("Dividing by zero");
        System.out.println(a / b);
    }

    static int readNumber(int start, int end) {
        try{
            int num = scanner.nextInt();
            if (num>end || num<start) throw new Exception("Mismatched range");
            return num;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
