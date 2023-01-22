package com.softserve.edu10.Homework.Homework_2;

import java.util.HashMap;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) {
        // I swapped the first name with the last name because I wasn't paying attention.
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Nazar", "Petryshyn");
        personMap.put("Ivan", "Ivanovuch");
        personMap.put("Dima", "Dmutrovuch");
        personMap.put("Oleg", "Olegovuch");
        personMap.put("Oleksandr", "Vasyliovuch");
        personMap.put("Marian", "Vasyliovuch");
        personMap.put("Vasyl", "Vasyliovuch");
        personMap.put("Igor", "Igorovuch");
        personMap.put("Roma", "Romanovuch");
        personMap.put("Oleksiy", "Oleksiyovuch");

        for (Map.Entry<String, String> map : personMap.entrySet()) {
            System.out.println("First name: " + map.getKey() + ", last name: " + map.getValue() + '.');
        }

        System.out.println("\nMap contains " + new Methods().equalsLastName(personMap) + " person with the same last name.");
        System.out.println();

        new Methods().removeLastName(personMap, "Vasyliovuch");
        System.out.println("Map with removed last name: \n" + personMap);
    }
}
