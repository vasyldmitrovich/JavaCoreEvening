package com.softserve.edu13.Homework.Homework_3;

import java.time.LocalDate;

public class AppMain {
    public static void main(String[] args) {
        int a = LocalDate.now().getYear();
        System.out.println(a);
        System.out.println(new Methods().isYearLeapSimply(2012));


    }
}
