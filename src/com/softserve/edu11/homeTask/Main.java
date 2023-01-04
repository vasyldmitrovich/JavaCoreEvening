package com.softserve.edu11.homeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        runFirst();
        runSecond();
        runThird();
    }

    static void runFirst() {
        int max = Integer.MIN_VALUE;
        char[] arrChar = new char[0];
        String sentence = scan.nextLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(sentence.split("\\W+")));

        for (String word : arr) {
            if (!word.matches("[a-zA-Z]+") || arr.size() != 5) {
                System.out.println("Bad input");
                return;
            }
        }

        for (String name : arr) {
            if (name.toCharArray().length > max) {
                max = name.toCharArray().length;
                arrChar = name.toCharArray();
            }
        }

        System.out.println("The longest word you input - " + new String(arrChar) + ", length of it - " + arrChar.length);
        System.out.println("Second word in reverse order - " + new StringBuilder(arr.get(1)).reverse());
    }

    static void runSecond() {
        String sentence = scan.nextLine();
        System.out.println("Replaced whitespaces with one" + sentence.replaceAll("\\s+", " "));
    }

    static void runThird() {
        Pattern pattern = Pattern.compile("\\$\\d+.\\d{2}");
        Matcher matcher = pattern.matcher("$1123.21");
        System.out.println(matcher.matches());
    }

}
