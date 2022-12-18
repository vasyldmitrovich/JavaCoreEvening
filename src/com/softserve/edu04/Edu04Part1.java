package com.softserve.edu04;

import java.util.Scanner;

/**
 * PRACTICAL TASKS
 * Enter three numbers.Find out how many of them are odd
 */
public class Edu04Part1 {
    public static void main(String[] args) {
        numbers();
    }

    static public void numbers() {
        int firstNumber, secondNumber, thirdNumber, count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        firstNumber = scanner.nextInt();
        if (firstNumber % 2 == 0) {
            count++;
        }

        System.out.println("Please enter the second number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right second number");
            scanner.next();
        }
        secondNumber = scanner.nextInt();
        if (secondNumber % 2 == 0) {
            count++;
        }

        System.out.println("Please enter the third number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right third number");
            scanner.next();
        }
        thirdNumber = scanner.nextInt();
        if (thirdNumber % 2 == 0) {
            count++;
        }

        System.out.println(count + " of 3 numbers are odd");
    }
}
