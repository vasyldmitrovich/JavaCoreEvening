package com.softserve.edu13.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        dayOfWeek();
        firstMonday();
        sortedList(arrInitialize());
        System.out.println(count(arrInitializeInteger(), n -> n % 2 == 0));

    }

    static void dayOfWeek() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Today is " + time.getDayOfWeek() + " " + time.getDayOfWeek().getValue() + " day in the week");
    }

    static void firstMonday() {
        TemporalAdjuster firstDay = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.with(firstDay) + " The first monday");
    }

    static void sortedList(List<String> list) {
        list.sort(Main::StringCompare);
        System.out.println(list);
    }

    static int StringCompare(String a, String b) {
        return a.compareTo(b);
    }

    static List<String> arrInitialize() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("a");
        return list;
    }

    static long count(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream()
                .filter(predicate)
                .count();
    }

    static List<Integer> arrInitializeInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        return list;
    }
}
