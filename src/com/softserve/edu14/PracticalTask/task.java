package com.softserve.edu14.PracticalTask;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class task {
    public static void WorkWithEmpty() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long countOfEmpty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Кількість пустих значень: " + countOfEmpty);

        List<String> newList = list.stream()
                .filter(i -> !i.isEmpty())
                .toList();
        System.out.println("Список непорожніх стрінгів  " + newList);

        String UpCase = list.stream()
                .filter(i -> !i.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Непорожні значення великим шрифтом: " + UpCase);

    }
    public static void numbers() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println("Кількість значень в списку : " + stats.getCount());
        System.out.println("MIN число в списку : " + stats.getMin());
        System.out.println("MAX число в списку : " + stats.getMax());
        System.out.println("Сума всіх чисел : " + stats.getSum());

    }
}
