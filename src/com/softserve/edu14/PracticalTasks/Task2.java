package com.softserve.edu14.PracticalTasks;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();
        System.out.println("count of numbers: " + stats.getCount());
        System.out.println("min of numbers: " + stats.getMin());
        System.out.println("max of numbers: " + stats.getMax());
        System.out.println("sum of numbers: " + stats.getSum());


    }
}
