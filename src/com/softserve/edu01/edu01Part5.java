package com.softserve.edu01;

import java.util.Scanner;

public class edu01Part5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost of calling the first country: ");
        int c1 = scan.nextInt();
        System.out.print("Enter the cost of calling the second country: ");
        int c2 = scan.nextInt();
        System.out.print("Enter the cost of calling the third country: ");
        int c3 = scan.nextInt();

        System.out.print("Enter the duration of the first country call: ");
        int t1 = scan.nextInt();
        System.out.print("Enter the duration of the second country call: ");
        int t2 = scan.nextInt();
        System.out.print("Enter the duration of the third country call: ");
        int t3 = scan.nextInt();

        System.out.println("Cost of a call to the first country: " + c1 * t1);
        System.out.println("Cost of a call to the second country: " + c2 * t2);
        System.out.println("Cost of a call to the third country: " + c3 * t3);
        System.out.println("Call cost for all countries: " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));
    }
}
