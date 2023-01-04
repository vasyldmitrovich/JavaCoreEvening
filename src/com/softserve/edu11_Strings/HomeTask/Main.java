package com.softserve.edu11_Strings.HomeTask;

import com.softserve.service.MyScanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        String s1 = MyScanner.writeInputString("Input sentence of five words");

        System.out.println("The longest word - "+findLongestWord(s1));

        System.out.println("Number of letters: "+countNumberLetters(s1));

        System.out.println("Reverse second word: "+reverseSecondWord(s1));

        s1 = deleteExtraSpaces(s1);
        System.out.println(s1);

        String s = MyScanner.writeInputString("Input text with currency");
        findCurrency(s);
    }

    public static String findLongestWord(String s){
        s = deleteExtraSpaces(s);
        String[] arrayWords= s.split(" ");

        String longestWord="";
        int maxLength = 0;

        for (String word: arrayWords
             ) {if (word.length()>maxLength){
                 maxLength = word.length();
                 longestWord = word;
        }
        }

        return longestWord;
    }

    public static int countNumberLetters(String s){
        Pattern p = Pattern.compile("[a-zA-Zа-яА-Я]");
        Matcher m = p.matcher(s);

        int number=0;
        while (m.find()){
            number++;
        }

        return number;
    }

    public static String reverseSecondWord(String s){
        s = deleteExtraSpaces(s);
        String[] arrayWords= s.split(" ");

        String secondWord = "";
        if (arrayWords.length>1) {
            StringBuilder s2 = new StringBuilder(arrayWords[1]);
            s2.reverse();
            secondWord = s2.toString();
        }

        return secondWord;
    }

    public static String deleteExtraSpaces(String s){
       while (s.contains("  ")){
           s= s.replaceAll("  "," ");
       }

       return s;
    }

    public static void findCurrency(String s){
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(s);

        System.out.println("Currency in text:");
        while (m.find()){
            System.out.println(s.substring(m.start(),m.end()));
        }
    }
}
