package com.softserve.Tasks;

public class Task6 {

    //6. Input text and calculate number of words in this text

    public static int wordsCalculator(String string) {

        String[] result = string.replaceAll("\\p{Punct}[ ]+", " ").split(" ");
        System.out.println(result.length);
        return result.length;
    }
}
