package com.softserve.edu13.practicalTask;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate.getDayOfWeek().toString().toLowerCase() + ".");
    }
}
