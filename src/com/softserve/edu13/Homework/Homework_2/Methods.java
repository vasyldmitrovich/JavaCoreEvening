package com.softserve.edu13.Homework.Homework_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Methods {

    public boolean validate(String string) {

        try{
            LocalDate parseDate = LocalDate.parse(string, DateTimeFormatter.ofPattern("MM.dd.yy"));
            return true;
        }
        catch (DateTimeException e){
            System.err.println("Date does not passed validate method.");
            return false;
        }
    }
}
