package com.softserve.edu04.PracticalTask04.Continent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Country = String.valueOf(Integer.parseInt(br.readLine()));

        System.out.println("Введіть Країну:");

        switch (Country){
            case "Ukraine", "Germany", "Austria", "Spain", "Belgium", "Czech Republic",
                    "Estonia", "Iceland", "Finland", "Sweden", "France", "Greece", "Hungary", "Italy", "Slovenia" ->
                System.out.println("Ця країна знаходиться в " + Continent.EUROPE.getContinent());

            case "China", "Japan", "Korea" ->
                System.out.println("Ця країна знаходиться в " + Continent.ASIA.getContinent());

            case "Ethiopia", "Kenia", "Egypt", "Tanzania" ->
                System.out.println("Ця країна знаходиться в " + Continent.AFRIKA.getContinent());
            case "Australia" ->
                    System.out.println("Ця країна знаходиться в " + Continent.AUSTRALIA.getContinent());
            case "USA", "Canada", "Florida", "Cuba", "Colombia" ->
                    System.out.println("Ця країна знаходиться в " + Continent.AMERICA.getContinent());
            default -> System.out.println("Цю країну не знайдно. Введіть коректну назву. ");

        }

    }


}
