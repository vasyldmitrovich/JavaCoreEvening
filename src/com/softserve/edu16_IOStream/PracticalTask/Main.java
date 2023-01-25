package com.softserve.edu16_IOStream.PracticalTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException{
        go();
    }

    public static void go() throws IOException {
        doFirstTask();

        System.out.println();
        doSecondTask();
    }

    public static void doFirstTask() throws IOException {
        List<String> arrayString = readFileInList();

        countSymbols(arrayString);

        System.out.println();
        findMaxMin(arrayString);

        System.out.println();
        findLines(arrayString, "the");
    }

    public static List<String> readFileInList(){
        List<String> arrayString = new ArrayList<>();

        String filename = "D:/Users/Лукьяненко/java/mytext.txt";

        try{
            String s = null;
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((s = br.readLine())!=null){
                arrayString.add(s);
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }

        return arrayString;
    }

    public static void countSymbols(List<String> arrayString){
        arrayString.forEach(s->System.out.println(s+" ("+s.length()+" symbols)"));
    }

    public static void findMaxMin(List<String> arrayList){
       int maxL = arrayList.get(0).length();
       int minL = arrayList.get(0).length();
       int maxI = 0;
       int minI = 0;

        for (int i = 1; i < arrayList.size(); i++) {
        if (arrayList.get(i).length()>maxL) {
            maxL = arrayList.get(i).length();
            maxI = i;
        }
            if (arrayList.get(i).length()<minL) {
                minL = arrayList.get(i).length();
                minI = i;
            }
        }

        System.out.println("Longest line: " + arrayList.get(maxI));
        System.out.println("Shortest line: " + arrayList.get(minI));
    }

    public static void findLines(List<String> arrayList, String word) {
        arrayList.stream()
                .filter(s -> s.indexOf(word) >= 0)
                .forEach(System.out::println);
    }

    public static void doSecondTask() {
        String text = readFileInText();

        findWordsStartVowel(text);

        findWords(text);

    }

    public static String readFileInText() {
        StringBuilder text = new StringBuilder("");

        String filename = "D:/Users/Лукьяненко/java/mytext.txt";

        try {
            String s = null;
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((s = br.readLine()) != null) {
                text.append(s+" ");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return text.toString();
    }

    public static void findWordsStartVowel(String text) {

        System.out.println("Words starting with a vowel");

        Pattern p = Pattern.compile("\\b[AaEeIiOoUuYy][a-z]*\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }
    }

    public static void findWords(String text) {
        System.out.println("Words for which the last letter matches with the first letter next word");

        text = text.toLowerCase();

        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                System.out.println(words[i]+"-"+words[i+1]);
            }
        }
    }
}
