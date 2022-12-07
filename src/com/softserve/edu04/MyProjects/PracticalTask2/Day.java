package com.softserve.edu04.MyProjects.PracticalTask2;

public enum Day {
    ONE ("Monday", "Понеділок"),
    TWO ("Tuesday", "Вівторок"),
    THREE ("Wednesday", "Середа"),
    FOUR ("Thesday", "Четвер"),
    FIVE ("Friday", "П'ятниця"),
    SIX ("Saturday", "Субота"),
    SEVEN ("Sunday", "Неділя");

    private final String ua;
    private final String en;

    Day (String en, String ua) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

}
