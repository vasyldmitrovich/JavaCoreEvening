package com.softserve.edu11.practicalTask;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Enter first string variable: ");
        String s1 = getStringInput();
        System.out.println("Enter second string variable: ");
        String s2 = getStringInput();

        System.out.println("Is first var substring second? "  + s2.contains(s1));
    }

    public static String getStringInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
