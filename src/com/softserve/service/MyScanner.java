package com.softserve.service;

import com.softserve.edu04.HomeTask4.myScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner  {
    public static Scanner scan = new Scanner(System.in);

    public static int writeInputInt(String s) throws NumberFormatException{
        try {
            System.out.println(s);
            String str = scan.next();
            return Integer.parseInt(str);
        }
        catch (NumberFormatException exception){
            throw exception;
        }
    }

    public static String writeInputString(String s)  {
        System.out.println(s);
        return myScanner.scan.nextLine();
    }

    public static double writeInputDouble(String s) throws NumberFormatException{
        try {
            System.out.println(s);
            String str = scan.next();
            return Double.parseDouble(str);
        }
        catch (NumberFormatException exception){
            throw exception;
        }
    }


}
