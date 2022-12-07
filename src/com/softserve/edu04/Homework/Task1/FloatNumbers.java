package com.softserve.edu04.Homework.Task1;

public class FloatNumbers {
    /* read 3 float numbers and check: are they all belong to the range [-5, 5]; */
    public static void main(String[] args) {
        float[] numbers = {-5.2f, 7.5f, 4.3f};

        for (float n : numbers) {
            if (n >= -5f && n <= 5f) {
                System.out.println("The number " + n + " belongs to the range [-5, 5]");
            }
            else {
                System.out.println("The number " + n + " doesn't belong to the range [-5, 5]");
            }
        }
    }
}
