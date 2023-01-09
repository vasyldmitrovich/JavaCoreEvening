package com.softserve.edu11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
    }

    /*Enter in the console sentence of five words. • display the longest word in the sentence
    • determine the number of its letters • bring the second word in reverse order */
    static void runFirstTask() {
        System.out.println("Enter your sentence");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        List<String> words = new ArrayList<>(List.of(sentence.split(" ")));
        String LongestString = "";
        for (String word: words) {
            if (word.length() > LongestString.length()) {
                LongestString = word;
            }
        }
        System.out.println("The longest word in the sentence is " + LongestString);
    }

    /* Enter a sentence that contains the words between more than one space. Convert all
spaces, consecutive, one. For example, if we introduce the sentence "I am learning
Java Core», we have to get the "I'm learning Java Core»*/

    static void runSecondTask() {
        System.out.println("Enter your sentence");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.println("Converted sentence is:" + sentence.replaceAll("\\s+", " "));
    }


    /*Implement a pattern for US currency: the first symbol "$", then any number of digits, dot
    and two digits after the dot. Enter the text from the console that contains several
    occurrences of US currency. Display all occurrences on the screen */
    static void runThirdTask() {

        System.out.println("Enter your occurrence");
        Scanner scan = new Scanner(System.in);
        String occurrence = scan.nextLine();
        String [] currency = occurrence.split(" ");
        for (String curUS: currency) {
            Pattern pattern = Pattern.compile("\\$\\d+.\\d{2}");
            Matcher match = pattern.matcher(curUS);
            if (match.matches()){
                System.out.println(curUS);
            }
        }
    }
}
