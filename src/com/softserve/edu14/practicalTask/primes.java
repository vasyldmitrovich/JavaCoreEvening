package com.softserve.edu14.practicalTask;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Arrays;

public class primes {


    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics rez = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();

        System.out.println( "\nКількість елементів в масиві: " + rez.getCount() +
                            "\nЕлемент, який має максимальне значення: " + rez.getMax() +
                            "\nЕлемент, який має мінімальне значення: " + rez.getMin() +
                            "\nСума елементів масиву: " + rez.getSum());

    }

}
