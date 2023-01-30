package com.softserve.edu16.PracticalTask.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {
        File textFile = new File("src\\com\\softserve\\edu16\\PracticalTask\\Task1\\text.txt");

        String s;
        FileReader reader = new FileReader(textFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        //BufferedReader bf = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        while ((s = bufferedReader.readLine()) != null) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        bufferedReader.close();

        numberOfsymbolsInLine(list);
        System.out.println();
        MaxAndMinLine(list);
        System.out.println();
        consistOfVar(list);

    }

    public static void numberOfsymbolsInLine(List<String> list) {
        for (String strings : list) {
            System.out.println("Number of symbols in line: " + strings + "    " + strings.length());
        }
    }

    public static void MaxAndMinLine(List<String> list){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String longestLine = null;
        String shortestLine = null;
        for (String strings: list) {
            if (strings.length() > max){
                max = strings.length();
                longestLine = strings;
            }
            if (strings.length() < min){
                min = strings.length();
                shortestLine = strings;
            }
        }
        System.out.println("The longest line: " + longestLine + "  " + max);
        System.out.println("The shortest line: " + shortestLine + "  " + min);
    }

    public static void  consistOfVar(List<String> list){
    for (String strings : list) {
        if (strings.contains("var")) {
            System.out.println(strings + "   consist of word (var)");
        }
        else {
            System.out.println(strings + "  No such word");
        }
//
    }
    }
}
