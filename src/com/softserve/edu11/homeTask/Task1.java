package com.softserve.edu11.homeTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Enter the sentence of five words: ");
        Scanner sentenceScanner = new Scanner(System.in);

        String sentence = sentenceScanner.nextLine();
        String[] words = sentence.split(" ");
        if (words.length != 5){
            System.out.println("You`ve entered wrong sentence. Please enter the sentence of 5 words");
            run();
        }

        String theLongestWord = findTheLongestWord(words);
        System.out.println("The longest word is: " + theLongestWord);
        System.out.println("Number of letters is: " + theLongestWord.length());
        System.out.println("Reversed second word: " + reverseWord(words[1]));
    }

    public static String reverseWord(String word){
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length/2; i++){
            char temp = letters[i];
            letters[i] = letters[letters.length-1-i];
            letters[letters.length-1-i] = temp;
        }
        return new String(letters);
    }

    public static String findTheLongestWord(String[] words){
        //we can use streams to find the longest word
        return Arrays.stream(words)
                .map(word -> word.trim())
                .sorted(Comparator.comparing(word -> -(word.length())))
                .limit(1).collect(Collectors.joining());
    }
}
