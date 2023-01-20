package com.softserve.edu11.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {

    public void homework() {
        System.out.println("Enter sentence of five words.");
        String inPut = inPut();
        String check = check(inPut);
        String longestWord = longestWord(check);
        int amountOfLettersInAWord = amountOfLettersInAWord(longestWord);
        String reverseSecondWord = reverseSecondWord(check);

        if (longestWord == null) {
            System.out.println("You have to enter five words. Try again");
            homework();
        } else {
            System.out.println("The longest word in the sentence: " + "[ " + longestWord + " ]"
                    + ", and it contains " + amountOfLettersInAWord + " ] letters."
                    + "Second word in reverse order: [ " + reverseSecondWord + " ].");
        }
    }

    public String inPut() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String check(String string) {
        Pattern p = Pattern.compile("[A-Za-z ]+");
        Matcher m = p.matcher(string);
        if (m.matches() && string.split(" ").length == 5) {
            return string;
        } else {
            return null;
        }
    }

    public String longestWord(String string) {
        if (string != null) {
            String longestWord = "";
            for (String s : string.split(" ")) {
                if (s.length() > longestWord.length()) {
                    longestWord = s;
                }
            }
            return longestWord;
        } else {
            return null;
        }
    }

    public int amountOfLettersInAWord(String string) {
        if (string == null || string.split(" ").length > 1) {
            return 0;
        } else {
            return string.length();
        }
    }

    public String reverseSecondWord(String string) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.split(" ")[1]);
            return stringBuilder.reverse().toString();
        } else {
            return null;
        }
    }
}
