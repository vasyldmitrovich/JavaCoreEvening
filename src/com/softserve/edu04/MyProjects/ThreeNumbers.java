package com.softserve.edu04.MyProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Practical task. Enter three numbers. Find out how many of them are odd.
 Roman Sitko. With main method*/
public class ThreeNumbers {
    private static int countOdd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three any integer numbers");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if (num1 % 2 == 0) {
            countOdd += 1;
        }
        if (num2 % 2 == 0) {
            countOdd += 1;
        }
        if (num3 % 2 == 0) {
            countOdd += 1;
        }

        System.out.println("Count odd: " + countOdd);

    }
}
