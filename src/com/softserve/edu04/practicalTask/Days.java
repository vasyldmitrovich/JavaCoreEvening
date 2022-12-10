package com.softserve.edu04.practicalTask;

enum Days {
    MONDAY("Понеділок | Monday"), TUESDAY("Вівторок | Tuesday"), WEDNESDAY("Середа | Wednesday"), THURSDAY("Четвер | Thursday"), FRIDAY("П'ятниця | Friday"), SATURDAY("Субота | Saturday"), SUNDAY("Неділя | Sunday");

    private final String day;

    Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}