package com.softserve.edu04.practicalTask.task3;

public enum Continents {
    ASIA("Asia"),
    AUSTRALIA("Australia"),
    AFRICA("Africa"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America");

    private final String CONTINENT_NAME;

    Continents(String continentName){
        this.CONTINENT_NAME = continentName;
    }

    public String getContinentName() {
        return CONTINENT_NAME;
    }
}
