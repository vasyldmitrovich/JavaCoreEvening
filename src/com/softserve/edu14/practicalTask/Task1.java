package com.softserve.edu14.practicalTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println("There are " + getAmountOfEmptyStrings(list) + " empty strings in this list");
        System.out.println("Not empty strings: " + removeAllEmptyStrings(list));
        System.out.println("Convert to string: " + convertToUppercaseAndJoinWithComma(list));
    }

    public static long getAmountOfEmptyStrings(List<String> strings){
        return strings.stream().filter(string -> string.equals("")).count();
    }

    public static List<String> removeAllEmptyStrings(List<String> strings){
        return strings.stream().filter(string -> !string.equals("")).collect(Collectors.toList());
    }

    public static String convertToUppercaseAndJoinWithComma(List<String> strings){
        return strings.stream().filter(string -> !string.equals("")).map(String::toUpperCase).collect(Collectors.joining(", "));
    }


}
