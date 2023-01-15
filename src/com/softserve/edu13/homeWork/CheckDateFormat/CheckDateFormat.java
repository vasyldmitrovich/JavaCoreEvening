package com.softserve.edu13.homeWork.CheckDateFormat;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class CheckDateFormat {
    public void checkDateFormat(){
        UserEnter.UserEnter("Введіть дату: ");
        String date = UserEnter.inform;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate y = LocalDate.parse( date, formatter);
            System.out.println("Вірний формат дати");
        }catch (DateTimeParseException e){
            System.err.println("Невірний формат дати");
        }
    }

    public static void main(String[] args) throws DateTimeParseException {
        CheckDateFormat newDate = new CheckDateFormat();
        newDate.checkDateFormat();
    }
}
