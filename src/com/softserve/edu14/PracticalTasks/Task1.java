package com.softserve.edu14.PracticalTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long emptyStrings  = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Print how many empty strings are in this list: " + emptyStrings);

        List <String> notEmptyStrings = list.stream()
                .filter(string -> !string.isEmpty())
                .toList();
        System.out.println("Print how many not empty strings are in this list: " + notEmptyStrings);

        String stringsToUppercase  = list.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("String to uppercase : " + stringsToUppercase);
    }
}
