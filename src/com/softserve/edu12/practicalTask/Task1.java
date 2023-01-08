package com.softserve.edu12.practicalTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){

        int a = 0, b = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a:");
            a = scanner.nextInt();
            System.out.println("Enter b:");
            b = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Wrong input!");
        }

        try {
            int square = squareRectangle(a,b);
            System.out.println(square);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) throws NegativeNumberException {
        if(a < 0 || b < 0) throw new NegativeNumberException("You`ve entered negative number");
        return a*b;
    }
}
