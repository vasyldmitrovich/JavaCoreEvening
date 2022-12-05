package com.softserve.edu04.practicalTask.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner countryNameScanner = new Scanner(System.in);
        System.out.println("Enter name of the country: ");

        switch (countryNameScanner.nextLine()){
            case "Ukraine", "Spain", "Germany", "Poland", "England":
                System.out.println("The continent, where country is located - " + Continents.EUROPE.getContinentName());
                break;
            case "China", "India", "Saudi Arabia", "Thailand":
                System.out.println("The continent, where country is located - " + Continents.ASIA.getContinentName());
                break;
            case "Egypt", "Algeria", "South Africa", "Kenia":
                System.out.println("The continent, where country is located - " + Continents.AFRICA.getContinentName());
                break;
            case "Australia", "New Zealand", "Solomon Islands", "Papua New Guinea":
                System.out.println("The continent, where country is located - " + Continents.AUSTRALIA.getContinentName());
                break;
            case "United States", "Mexico", "Canada":
                System.out.println("The continent, where country is located - " + Continents.NORTH_AMERICA.getContinentName());
                break;
            case "Brazil", "Colombia", "Peru":
                System.out.println("The continent, where country is located - " + Continents.SOUTH_AMERICA.getContinentName());
                break;
            default:
                System.out.println("No such country in the list...");
        }
    }
}
