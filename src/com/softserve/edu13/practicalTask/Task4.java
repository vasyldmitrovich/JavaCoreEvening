package com.softserve.edu13.practicalTask;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Integer[] integers = {4,1,2,3,5,7,22,64,789,32};
        long evenNumbers = count(integers, integer -> integer % 2 == 0);
        System.out.println(evenNumbers);
    }

    public static long count(Integer[] array, Predicate<Integer> predicate){
        return Arrays.stream(array).filter(predicate).count();
    }
}
