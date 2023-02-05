package com.softserve.edu10.homework;

import java.util.Map;
import java.util.TreeMap;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new TreeMap<>();
        personMap.put("Morgan", "Freeman");
        personMap.put("Denzel", "Washington");
        personMap.put("Keanu", "Reeves");
        personMap.put("Danny", "Washington");
        personMap.put("Tom", "Hanks");
        personMap.put("Julia", "Roberts");
        personMap.put("Jack", "Nicholson");
        personMap.put("Dwayne", "Johnson");
        personMap.put("Jackie", "Chan");
        personMap.put("Sandra", "Bullock");
        System.out.println(personMap.entrySet());

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Washington"));
        System.out.println(personMap.entrySet());
    }
}
