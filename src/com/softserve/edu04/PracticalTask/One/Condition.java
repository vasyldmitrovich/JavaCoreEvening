package com.softserve.edu04.PracticalTask.One;

public class Condition {

    public static int howManyAreOdd(int a, int b, int c) {
        int count = 0;
        if (a >= 0 ) {
            count++;
        }
        if (b >= 0) {
            count++;
        }
        if (c >= 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyAreOdd(-1, -2, -3));
    }
}
