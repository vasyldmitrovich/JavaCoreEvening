package com.softserve.edu04.PracticalTask4;

public enum Continents {
    ASIA("Asia"), AFRICA("Africa"), EUROPE("Europe"), AUSTRALIA("Australia"), NORTH_AMERICA("North America"), SOUTH_AMERICA("South America");

    private final String name;

    Continents(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
