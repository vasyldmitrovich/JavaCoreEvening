package com.softserve.edu04.PracticalTask;

public class OddNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 15;
        int c = 356;

        int [] numbers = {a, b, c};
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Number: " + number + " is odd.");
            }
        }
    }
}
