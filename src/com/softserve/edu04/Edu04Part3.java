package com.softserve.edu04;

import java.util.Scanner;

/**
 * PRACTICAL TASKS
 * Enter the name of the country. Print the name of the continent
 * (Declare enum with names of continents)
 */
public class Edu04Part3 {
    public static void main(String[] args) {
        continent(country());
    }

    public static String country() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the country");
        return scanner.next();
    }

    public static void continent(String nameCountry) {
        switch (nameCountry) {
            case "Sudan", "Niger", "Mali", "Nigeria", "Morocco" -> {
                Continents africa = Continents.AFRICA;
                System.out.println("Continent of the specified country is: " + africa);
            }
            case "China", "India", "Afghanistan", "Japan", "Cambodia" -> {
                Continents asia = Continents.ASIA;
                System.out.println("Continent of the specified country is: " + asia);
            }
            case "Ukraine", "Germany", "Italy", "Greece", "Poland" -> {
                Continents europe = Continents.EUROPE;
                System.out.println("Continent of the specified country is: " + europe);
            }
            case "Mexico", "Brazil", "Colombia", "Chile", "Ecuador" -> {
                Continents southAmerica = Continents.SOUTH_AMERICA;
                System.out.println("Continent of the specified country is: " + southAmerica);
            }
            case "Cuba", "Barbados", "Panama", "Nicaragua", "Dominica" -> {
                Continents northAmerica = Continents.NORTH_AMERICA;
                System.out.println("Continent of the specified country is: " + northAmerica);
            }
            case "New Zealand", "Samoa", "Vanuatu", "Kiribati", "Nauru" -> {
                Continents australia = Continents.AUSTRALIA;
                System.out.println("Continent of the specified country is: " + australia);
            }
            case "Argentine Antarctica", "Australian Antarctic Territory", "Queen Maud Land", "Ross Dependency", "Peter I Island" -> {
                Continents antarctica = Continents.ANTARCTICA;
                System.out.println("Continent of the specified country is: " + antarctica);
            }
            default -> System.out.println("Country not recognized");

        }
    }
}
