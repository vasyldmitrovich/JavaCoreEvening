package com.softserve.edu13.PracticalTask.PracticalTask_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateOfFirstMondayForCurrentMonth {
    public static void main(String[] args) {

        System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }
}
