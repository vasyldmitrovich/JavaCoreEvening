package com.softserve.edu14.PracticalTask.PracticalTask_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        //Print how many empty strings are in this list
        System.out.println(list1.stream()
                .filter(String::isEmpty)
                .count());

        //Remove all empty Strings from list and print the result
        var list2 = list1.stream()
                .filter(e -> !e.isEmpty())
                .toList();
        System.out.println(list2);

        //Convert String to uppercase and Join them with coma. Print the result
        var list3 = list2.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list3);
    }
}
