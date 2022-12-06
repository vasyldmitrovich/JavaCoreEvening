package com.softserve.edu04.PracticalTask.Continents;

public enum Continents {
    Asia("Asia"),
    SouthAmerica("South America"),
    NorthAmerica("North America"),
    Africa("Africa"),
    Europe("Europe"),
    Australia("Australia");

    private final String continent;

    Continents(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
