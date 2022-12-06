package com.softserve.edu04.PracticalTask.Continents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainContinent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the country:");
        String country = br.readLine();
        switch (country) {
            case "China", "India", "Southern Asia", "Indonesia", "Pakistan",
                    "Bangladesh", "Philippines", "Vietnam", "Turkey", "Iran", "Thailand",
                    "Myanmar", "South Korea", "Iraq", "Afghanistan" -> {
                System.out.println("This country is located in the continent:"
                        + Continents.Asia.getContinent());
            }
            case "Brazil", "Argentina", "Peru", "Colombia", "Bolivia", "Venezuela",
                    "Chile", "Paraguay" -> {
                System.out.println("This country is located in the continent: "
                        + Continents.SouthAmerica.getContinent());
            }
            case "Bahamas", "Barbados", "Canada", "Cuba", "Dominica",
                    "Dominican Republic", "Grenada", "Jamaica", "Mexico", "Panama",
                    "United States of America", "USA" -> {
                System.out.println("This country is located in the continent: "
                        + Continents.NorthAmerica.getContinent());
            }
            case  "Algeria", "Egypt", "Libya", "Morocco", "Sudan", "Tunisia",
                    "Angola", "Cameroon", "Central African Republic","Chad",
                    "Botswana", "Lesotho", "Namibia", "Swaziland" ->
                    System.out.println("This country is located in the continent: "
                            + Continents.Africa.getContinent());
            case "Austria", "Belgium", "Czech Republic", "Denmark", "Estonia",
                    "Finland","France", "Germany","Greece", "Hungary", "Iceland",
                    "Italy", "Slovenia", "Spain", "Sweden", "Switzerland", "Ukraine" ->
                    System.out.println("This country is located in the continent: "
                            + Continents.Europe.getContinent());
            case "Australia" ->
                    System.out.println("This country is located in the continent: "
                            + Continents.Australia.getContinent());
            default -> System.out.println("There is no such country in the list, please try another one");
        }
    }
}
