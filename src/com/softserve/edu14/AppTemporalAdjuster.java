package com.softserve.edu14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AppTemporalAdjuster {
    public static void main(String[] args) {
        //Find when will be first Monday of month
        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 19);
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInMonth));
        //Next Tuesday after some date
        TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println(localDate.with(nextTue));
    }
}



