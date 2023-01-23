package com.softserve.edu13.Homework.Homework_4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Methods {

    public DayOfWeek dayOfTheWeek(LocalDate localDate) {
        return localDate.getDayOfWeek();
    }

    public DayOfWeek dayOfTheWeekAfter6Months(LocalDate localDate) {
        return localDate.plusMonths(6).getDayOfWeek();
    }

    public DayOfWeek dayOfTheWeekAfter12Months(LocalDate localDate) {
        return localDate.plusMonths(12).getDayOfWeek();
    }

    public void exercise(LocalDate localDate) {
        System.out.println("Day of the week: " + dayOfTheWeek(localDate));
        System.out.println("Day of the week after 6 months: " + dayOfTheWeekAfter6Months(localDate));
        System.out.println("Day of the week after 12 months: " + dayOfTheWeekAfter12Months(localDate));
    }
}
