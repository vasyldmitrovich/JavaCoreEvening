package com.softserve.edu13.PracticalTask.PracticalTask_4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Methods {

    public int count(int[] array, Predicate<Integer> predicate) {
        int count = 0;
        for (int integer : array) {
            if (predicate.test(integer)) {
                count++;
            }
        }
        return count;
    }
}
