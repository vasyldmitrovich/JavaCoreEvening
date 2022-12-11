package com.softserve.edu01;

import java.util.Scanner;

public class Edu01Part3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius = scan.nextInt();
        System.out.println("Perimeter of circle is: " + (float) (2 * 3.14 * radius));
        System.out.println("Area of a circle is: " + (float) 3.14 * (radius * radius));
    }
}
