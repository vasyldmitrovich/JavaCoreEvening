package com.softserve.edu11.homework;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence of five words: ");
        String sentence = scanner.nextLine().trim();

        Pattern p = Pattern.compile("\\b[A-z]+\\b");
        Matcher m = p.matcher(sentence);

        ArrayList<String> arrayList = new ArrayList<>();
        while (m.find()) {
            arrayList.add(m.group());
        }
        arrayList.sort((o1, o2) -> o2.length() - o1.length());

        if (arrayList.size() > 1) {
            System.out.println(arrayList.get(0));
            System.out.println(arrayList.get(0).length());
            System.out.println(new StringBuffer(arrayList.get(1)).reverse());
        } else {
            System.out.println("Incorrect sentence");
        }

    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence of five words: ");
        String sentence = scanner.nextLine().trim();

        Pattern p = Pattern.compile("\\b[A-z]+\\b");
        Matcher m = p.matcher(sentence);

        ArrayList<String> arrayList = new ArrayList<>();

        while (m.find()) {
            arrayList.add(m.group());
        }

        StringBuilder str = new StringBuilder();
        if (arrayList.size() > 0) {
            for (String s : arrayList) {
                str.append(s).append(" ");
            }
        } else {
            System.out.println("Incorrect sentence");
        }
        String finalSentence = String.valueOf(str).trim();
        System.out.println(finalSentence);
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence of five words: ");
        String sentence = scanner.nextLine().trim();

        Pattern p = Pattern.compile("\\B\\$\\d+.\\d{2}\\b");
        Matcher m = p.matcher(sentence);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
