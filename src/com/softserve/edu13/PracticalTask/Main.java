package com.softserve.edu13.PracticalTask;

import com.softserve.service.MyScanner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        sortingStringList();

        System.out.println();
        doTask4();

        System.out.println();
        writeDayOfWeek();

        System.out.println();
        writeDateOfFirstMonday();

    }

    public static void sortingStringList(){
        List<String> listString = new ArrayList<>();

        System.out.println("Input 10 words");
        for (int i = 0; i < 10; i++) {
            listString.add(MyScanner.scan.next());
        }

        listString.sort(String::compareTo);
        listString.forEach(System.out::println);
    }

    public static void doTask4(){
        Integer[] arrayInt = new Integer[10];


        for (int i = 0; i < 10;) {
            try {
                arrayInt[i] = MyScanner.writeInputInt("Input integer number");
                i++;
            }
            catch (NumberFormatException exception){
                System.out.println("Invalid value");
            }
        }

        Predicate<Integer> predicate = x-> x%2==0;
        System.out.println("Count of ever numbers: "+count(arrayInt, predicate));

        Predicate<Integer> predicate1 = x-> x>=5 & x<=25;
        System.out.println("Count of numbers in range [5; 25] : "+count(arrayInt, predicate1));

    }

    public static int count(Integer[] arrayInt, Predicate predicate){
        int count = 0;

        for (Integer integer : arrayInt) {
            if (predicate.test(integer)) {
                count++;
            }
        }
        return count;
    }

    public static void writeDayOfWeek(){
        System.out.println("Today is "+LocalDate.now().getDayOfWeek());
    }

    public static void writeDateOfFirstMonday(){
       LocalDate currentDate = LocalDate.now();
       TemporalAdjuster ta = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);

       System.out.println("Date of first Monday in current month is "+currentDate.with(ta));
    }


}
