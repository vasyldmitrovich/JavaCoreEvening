package com.softserve.edu14.PracticalTask.PracticalTask_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        //calculate count
        System.out.println(primes.size());//??? System.out.println(primes.stream().count());

        //calculate max
        var max = primes.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);

        //calculate min
        var min = primes.stream().min(Integer::compareTo).orElse(0);
        System.out.println(min);

        //calculate sum
        var sum = primes.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
