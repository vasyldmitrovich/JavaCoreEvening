package com.softserve.edu13.PracticalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Integer[] array = declareArray();
        Predicate<Integer> predicate = (s) -> s > 0;
        long countOfElements = count(array, predicate);
        System.out.println(countOfElements);
    }

    public static Integer[] declareArray(){
        Integer [] myArray = {1, -2, -3, 4, 5, 6, 7, 8, 9, 10};
        return myArray;
    }

    public static long count(Integer[] myArray,  Predicate<Integer> predicate ){
    return Arrays.stream(myArray).filter(predicate).count();
    }
}
