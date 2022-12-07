package com.softserve.edu04.practicalTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Continent {
    public static void getContinents() {
        System.out.println("Input country");
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        System.out.println(Continents.valueOf(Continents.getContinent(country)));
    }

    public enum Continents {
        NORTH_AMERICA("U.S.A." + "USA" + "Mexico" + "Canada" + "Guatemala" + "Haiti" + "Cuba" + "Dominican Republic"),
        SOUTH_AMERICA("Brazil" + "Colombia" + "Argentina" + "Peru" + "Venezuela" + "Chile" + "Ecuador" + "Bolivia" + "Paraguay" + "Uruguay"),
        ASIA("China" + "India" + "Indonesia" + "Pakistan"),
        EUROPE("Germany" + "United Kingdom" + "France" + "Italy" + "Spain" + "Ukraine" + "Poland"),
        AUSTRALIA("Australia" + "Papua New Guinea" + "New Zealand" + "Fiji" + "Solomon Islands"),
        AFRICA("Nigeria" + "Ethiopia" + "Egypt" + "Democratic" + "Tanzania" + "South Africa" + "Kenya"),
        ANTARCTICA("Antarctica");
        static HashMap<String, String> map = new HashMap<>();

        public static void mapper() {
            for (Continents cont : values()) {
                for (String country : Arrays.asList(cont.getCountry())) {
                    map.put(cont.toString(), country);
                }
            }
        }

        private String country;

        Continents(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public static String getContinent(String country) {
            mapper();
            for (String key : map.keySet()) {
                if (map.get(key).toLowerCase().contains(country.toLowerCase())) return key;
            }
            return "Unknown country (add it)";
        }
    }
}

