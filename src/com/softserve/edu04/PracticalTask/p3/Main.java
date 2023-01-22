package com.softserve.edu04.PracticalTask.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter country :");
        String country = br.readLine();

    switch (country) {
        case "Germany", "Belgium", "Poland", "Ukraine" -> System.out.println("Your continent is :"+Continent.Europe);
        case "China", "Japan", "Korea", "India" -> System.out.println("Your continent is :"+Continent.Asia);
        case "Ethiopia", "Kenia", "Egypt", "Morocco" -> System.out.println("Your continent is :"+Continent.Africa);
        case "Australia", "New Zealand", "Fiji", "Solomon Islands" -> System.out.println("Your continent is :"+Continent.Australia);
        case "Canada", "Brazil", "Cuba", "Colombia" -> System.out.println("Your continent is :"+Continent.America);
        default -> System.out.println("Incorrect country!");
    }

        }
        }


