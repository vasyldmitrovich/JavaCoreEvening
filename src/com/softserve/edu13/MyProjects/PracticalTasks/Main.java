package com.softserve.edu13.MyProjects.PracticalTasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Main {

    private static LocalDate currentDate = LocalDate.now();

    public static void main(String[] args) {
        Task1Run();
        Task2Run();
        Task3Run();
        Task4Run();

    }

    public static void Task1Run() {
        System.out.println("\nTask 1:");
        DayOfWeek today = currentDate.getDayOfWeek();
        System.out.println("Day of today: " + today);
    }

    public static void Task2Run() {
        System.out.println("\nTask 2:");
        LocalDate currentDate = LocalDate.now();
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Date of first Monday of current month: " + currentDate.with(firstMonInMonth));
    }

    public static void Task3Run() {
        System.out.println("\nTask 3:");
        List<String> list = new ArrayList<>();
        list.add("April");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("May");
        list.add("June");
        System.out.println("Original list: " + list);
        System.out.println("Sorted list: " + ToDo.sortList(list));
    }

    public static void Task4Run() {
        System.out.println("\nTask 4:");
        List<Integer> list = Arrays.asList(4, 3, 1, 5, 3, 2, 7, 6, 8, 10, 9);
        System.out.println("Original int list: " + list);
        System.out.println("num > 5: " + ToDo.count(list, num -> num > 5));
        System.out.println("num == 3: " + ToDo.count(list, num -> num == 3));
        System.out.println("num <= 2: " + ToDo.count(list, num -> num <= 2));
    }
}
