package com.softserve.Tasks;

import java.util.Scanner;

public class Task3 {
    public static void doTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input cost of dollar ");
        double costOfDollar = sc.nextDouble();
        System.out.println("sum of money in gryvna");
        double sumOfGrn = sc.nextDouble();
        System.out.println("Dollars can buy: " + sumOfGrn/costOfDollar);
    }
}
