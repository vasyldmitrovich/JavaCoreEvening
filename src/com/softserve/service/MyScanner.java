package com.softserve.service;

import com.softserve.edu04.HomeTask4.myScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
    public static Scanner scan = new Scanner(System.in);

    public static int writeInputInt(String s) {
        System.out.println(s);
        return myScanner.scan.nextInt();

    }

    public static String writeInputString(String s)  {
        System.out.println(s);
        return myScanner.scan.nextLine();
    }

    public static double writeInputDouble(String s){
        System.out.println(s);
        return myScanner.scan.nextDouble();
    }
}
