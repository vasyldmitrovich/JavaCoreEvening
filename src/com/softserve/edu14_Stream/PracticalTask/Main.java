package com.softserve.edu14_Stream.PracticalTask;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        List<String> list = Arrays.asList("bla","","simp","","second","third","third", "sec", "blablabla");

        System.out.println("Original list: "+list);

        countEmpty(list);
        removeEmpty(list);
        convertUppercaseString(list);

        System.out.println();
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        System.out.println("Original list: "+primes);

        printStatistic(primes);

    }

    public static void countEmpty(List<String> list){
        long count = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Amount empty string "+count);

    }

    public static void removeEmpty(List<String> list){
        list = list.stream()
                .filter(string->!string.isEmpty())
                .collect(Collectors.toList());

        System.out.println("List without empty values "+list);
    }

    public static void convertUppercaseString(List<String> list){
        String string = list.stream()
                .filter(str->!str.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(string);
    }

    public static void printStatistic(List<Integer> primes){
        IntSummaryStatistics stat = primes.stream()
                .mapToInt(x->x).summaryStatistics();

        System.out.println("Count: "+stat.getCount());
        System.out.println("Min: "+stat.getMin());
        System.out.println("Max: "+stat.getMax());
        System.out.println("Sum: "+stat.getSum());
    }
}
