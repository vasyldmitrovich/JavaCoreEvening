package com.softserve.edu13.PracticalTask;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task4 {
    public static void elements(){
        Integer[] array = myNumbers();
        Predicate<Integer> predicate = (s) -> s % 5 == 0;
        long countOfElements = count(array, predicate);
        System.out.println("Кількість елементів що діляться на 5 без залишку:  " +countOfElements);
    }

    public static Integer[] myNumbers(){
        Integer [] myNumbers = {50, 55, -37, 2, 117, -65, 45, 46, -85, 1000};
        return myNumbers;
    }

    public static long count(Integer[] myNumbers,  Predicate<Integer> predicate ){
        return Arrays.stream(myNumbers).filter(predicate).count();
    }
}
