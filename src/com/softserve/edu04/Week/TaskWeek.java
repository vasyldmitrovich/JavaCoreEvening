package com.softserve.edu04.Week;

public enum TaskWeek {
    First ("Monday", "Понеділок"),
    Second ("Tuesday", "Вівторок"), Third("Wednesday", "Середа"),
    Fourth ("Thursday", "Четвер"), Fifth("Friday", "П*ятниця"), Sixth("Saturday", "Субота"),
    Seventh("Sunday", "Неділя");

    private final String En;
    private final String Ua;

    TaskWeek (String En, String Ua){
        this.En = En;
        this.Ua = Ua;
    }

    public String getEn() {
        return En;
    }
    public String getUa() {
        return Ua;
    }
}
