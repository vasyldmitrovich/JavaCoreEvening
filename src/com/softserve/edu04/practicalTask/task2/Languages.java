package com.softserve.edu04.practicalTask.task2;

public enum Languages {

    FIRST_DAY("Montag", "Monday"),
    SECOND_DAY("Dienstag", "Tuesday"),
    THIRD_DAY("Mittwoch","Wednesday"),
    FOURTH_DAY("Donnerstag","Thursday"),
    FIFTH_DAY("Freitag","Friday"),
    SIXTH_DAY("Samstag", "Saturday"),
    SEVENTH_DAY("Sonntag", "Sunday");


    private final String deuLang;
    private final String engLang;

    Languages(String deuLang, String engLang){
        this.deuLang = deuLang;
        this.engLang = engLang;
    }

    public String getDeuLang() {
        return deuLang;
    }

    public String getEngLang() {
        return engLang;
    }
}
