package com.softserve.edu13.PracticalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of the Week: " + dayOfWeek);
        System.out.println("Number of day of the Week: "
                + dayOfWeek.getValue());
    }
}
