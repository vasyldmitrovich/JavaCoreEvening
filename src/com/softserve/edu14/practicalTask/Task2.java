package com.softserve.edu14.practicalTask;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Count of numbers: " + getCountOfNumbers(primes));
        System.out.println("Sum is: " + getSumOfList(primes));
        System.out.println("Min is: " + getMin(primes));
        System.out.println("Max is: " + getMax(primes));
    }


    public static long getCountOfNumbers(List<Integer> integers){
        return integers.stream().count();
    }

    public static int getSumOfList(List<Integer> integers){
        return integers.stream().mapToInt(number -> number).sum();
    }

    public static int getMin(List<Integer> integers){
        return integers.stream().mapToInt(number -> number).min().orElse(-1);
    }


    public static int getMax(List<Integer> integers){
        return integers.stream().mapToInt(number -> number).max().orElse(-1);
    }
}
