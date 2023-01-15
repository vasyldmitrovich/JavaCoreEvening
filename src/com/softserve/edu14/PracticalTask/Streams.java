package com.softserve.edu14.PracticalTask;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        runFirstTask();
        runSecondTask();
    }

    static void runFirstTask() {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        long isEmpty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Number of empty strings in this list: " + isEmpty);

        List <String> isFiltered = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Removed all empty Strings from list: " + isFiltered);

        String toUpperCase = list.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Convert list to String Uppercase: " + toUpperCase);
    }

    //For given collection calculate count, min, max, sum, for numbers and print all results
    static void runSecondTask() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();
        System.out.println("Number of primes: " + stats.getCount());
        System.out.println("Highest number in list: " + stats.getMax());
        System.out.println("Lowest number in list: " + stats.getMin());
        System.out.println("Sum of all numbers in list: " + stats.getSum());

    }
}
