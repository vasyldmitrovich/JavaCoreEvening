package com.softserve.edu11.homeTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        //Enter a sentence that contains the words between more than one space.
        // Convert all spaces, consecutive, one.
        System.out.println("Enter the sentence: ");
        String sentence = new Scanner(System.in).nextLine();
        String newSentence = convertAllSpacesToOne(sentence);
        System.out.println(newSentence);
    }

    public static String convertAllSpacesToOne(String sentence){
        return sentence.replaceAll("\\s+", " ");
    }
}
