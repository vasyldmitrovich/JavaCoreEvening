package com.softserve.edu13.Homework.Homework_3;

import java.time.LocalDate;

public class Methods {

    public boolean isYearLeap(int year) {
        return year % 4 == 0 || year % 100 == 0 && year % 400 == 0;
    }

    public boolean isYearLeap(LocalDate localDate) {
        return localDate.getYear() % 4 == 0 || localDate.getYear() % 100 == 0 && localDate.getYear() % 400 == 0;
    }

    public boolean isYearLeapSimply(int year) {
        return LocalDate.of(year, 1 , 1).isLeapYear();
    }
}
