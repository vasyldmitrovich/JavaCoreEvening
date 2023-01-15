package com.softserve.edu13.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAdjuster;

public class Time {
    LocalDate localDate = LocalDate.now();
    public void dateOfFirstMonday(){
        TemporalAdjuster dateOfFirstMonday = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Дата першого понеділка в поточному місяці: " +
                localDate.with(dateOfFirstMonday).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.dateOfFirstMonday();
        System.out.println(t.localDate.getDayOfWeek());


    }
}
