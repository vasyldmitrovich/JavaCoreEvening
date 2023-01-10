package com.softserve.edu13.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        LocalDate localDate = LocalDate.now();
        System.out.println("First monday for current month: "
                           + localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }
}
