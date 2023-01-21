package com.softserve.edu14.practicalTask;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class someList {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        long countEmpty = list.stream()
                .filter(string -> string.isEmpty())
                .count();

        List<String> listWithoutEmptyStr = list.stream()
                        .filter(string -> !string.isEmpty())
                        .toList();


        String joinedStr = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));

        System.out.println(countEmpty);
        System.out.println(listWithoutEmptyStr);
        System.out.println(joinedStr.toUpperCase());

    }
}
