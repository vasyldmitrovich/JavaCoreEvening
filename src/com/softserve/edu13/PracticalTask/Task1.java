package com.softserve.edu13.PracticalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task1 {
    public static void TaskToday() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Сьогодні: " + localDate.getDayOfWeek().toString().toLowerCase() + ".");
    }


    public static void TaskMonday() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Перший понеділок в місяці: "
                + localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }


}