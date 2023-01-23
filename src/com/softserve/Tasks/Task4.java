package com.softserve.Tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String s = sc.nextLine();
        Pattern louds = Pattern.compile("(?iu)[AaEeIiOoUuYy]");

        Matcher m = louds.matcher(s);
        int loudCounter = 0;
        while (m.find()) {
            loudCounter++;
        }
        System.out.println("Number of loud letters: " + loudCounter);
    }
}
