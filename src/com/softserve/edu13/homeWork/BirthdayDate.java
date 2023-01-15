package com.softserve.edu13.homeWork;

import java.time.LocalDate;

public class BirthdayDate {

    public String DayOfWeek(LocalDate date){
        return String.valueOf(date.getDayOfWeek());
    }

    public LocalDate newDate(LocalDate date, int month){
        LocalDate newDate = date.plusMonths(month);
        return newDate;
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1991, 6, 11);
        BirthdayDate date = new BirthdayDate();

        LocalDate birthDatePlusSixMonth = date.newDate(birthday, 6);
        LocalDate birthDatePlusTwelveMonth = date.newDate(birthday, 12);

        System.out.println("День тижня згідно дати народження: " + date.DayOfWeek(birthday)
            + "\nДень тижня за 6 місяців від дати народження: " + date.DayOfWeek(birthDatePlusSixMonth)
            +"\nДень тижня за 12 місяців від дати народження: " + date.DayOfWeek(birthDatePlusTwelveMonth));


    }
}
