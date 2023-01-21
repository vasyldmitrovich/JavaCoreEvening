package com.softserve.edu16.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println(testWord);
        System.out.println("Input character");
        character = br.readLine();

        for (int i = 0; i < testWord.length(); i++) {
            if (character.equals(testWord.substring(i, i + 1))) countCharacters++;
        }

        System.out.println("There are character " + character + " "
                + countCharacters + " times in the word " + testWord);

    }
}
