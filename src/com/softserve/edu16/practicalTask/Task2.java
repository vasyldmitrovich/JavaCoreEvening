package com.softserve.edu16.practicalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException {
        File file = new File("src\\com\\softserve\\edu16\\practicalTask\\myfile.txt");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()){
            words.add(scanner.next());
        }

        printWordsWhichStartingWithVowel(words);
        printIfLettersMatching(words);
        fileReader.close();
    }

    public static void printWordsWhichStartingWithVowel(List<String> words){
        System.out.println("Starting with vowel: ");
        words.stream()
                .filter(word -> word.substring(0,1)
                        .toLowerCase()
                        .matches("[aeiou]"))
                .forEach(System.out::println);
    }

    public static void printIfLettersMatching(List<String> words){
        System.out.println("Words, for which the last letter of one word matches the first letter of the next letter:");
        for (int i = 0; i < words.size()-1; i++){
            String word = words.get(i);
            String nextWord = words.get(i+1);
            if(word.charAt(word.length()-1) == nextWord.charAt(0)){
                System.out.println("Word: " + word);
                System.out.println("next word: " + nextWord);
            }
        }
    }
}
