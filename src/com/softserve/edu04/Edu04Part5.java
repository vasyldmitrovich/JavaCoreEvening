package com.softserve.edu04;

import java.util.Scanner;

/**
 * HOMEWORK
 * read 3 float numbers and check: are they all belong to the range [-5, 5];
 * read 3 integer numbers and write max and min of them;
 */
public class Edu04Part5 extends Edu04Part1 {
    public static void main(String[] args) {
        numbersFloat();
        numbersInt();

    }
    public static void numbersFloat() {
        float firstNumber, secondNumber, thirdNumber;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        while (!scanner.hasNextFloat()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        firstNumber = scanner.nextFloat();
        if (-5 <= firstNumber && firstNumber <= 5) {
            count++;
        }


        System.out.println("Please enter the second number");
        while (!scanner.hasNextFloat()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        secondNumber = scanner.nextFloat();
        if (-5 <= secondNumber && secondNumber <= 5) {
            count++;
        }

        System.out.println("Please enter the third number");
        while (!scanner.hasNextFloat()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        thirdNumber = scanner.nextFloat();
        if (-5 <= thirdNumber && thirdNumber <= 5) {
            count++;
        }
        if (count == 3) {
            System.out.println("All digits in the given range");
        } else {
            System.out.println("Not all numbers are in the given range");
        }
    }

    static public void numbersInt() {
        int firstNumber, secondNumber, thirdNumber;
        int max = 0, min = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        firstNumber = scanner.nextInt();
        if (firstNumber > max)
            max = firstNumber;
        if (firstNumber < max)
            min = firstNumber;


        System.out.println("Please enter the second number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        secondNumber = scanner.nextInt();
        if (secondNumber > max)
            max = secondNumber;
        if (secondNumber < max)
            min = secondNumber;

        System.out.println("Please enter the third number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        thirdNumber = scanner.nextInt();
        if (thirdNumber > max)
            max = thirdNumber;
        if (thirdNumber < max)
            min = thirdNumber;
        System.out.println("Max number is " + max +", " + "min number is " + min);
    }


}
