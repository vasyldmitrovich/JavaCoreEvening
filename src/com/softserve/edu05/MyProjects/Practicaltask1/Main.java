package com.softserve.edu05.MyProjects.Practicaltask1;

/* Roman Sitko.
Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int length;
    private static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array: ");
        length = Integer.parseInt(br.readLine());

        do {
            System.out.println("Enter integer number of array: ");
            num[length] = Integer.parseInt(br.readLine());
            --length;
        } while (length < 0);

    }

}
