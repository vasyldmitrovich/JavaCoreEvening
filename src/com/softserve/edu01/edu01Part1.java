package com.softserve.edu01;

import java.io.IOException;
import java.util.Scanner;

public class edu01Part1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter symbol \"a\"");
        int a = scan.nextInt();
        System.out.println("Please enter symbol \"b\"");
        int b = scan.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / (double) b));
    }
}
