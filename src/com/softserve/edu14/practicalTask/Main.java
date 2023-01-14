package com.softserve.edu14.practicalTask;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    static void firstTask() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long emptyCount = list.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Empty count - " + emptyCount);
        List<String> newList = list.stream()
                .filter(i -> !i.isEmpty())
                .toList();
        System.out.println("List without empty Strings " + newList);

        String listUpper = list.stream()
                .filter(i -> !i.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(listUpper);
    }

    static void secondTask() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics intSummaryStatistics = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());

    }


}
