package com.softserve.edu10.homeTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Map<String, String> personsList = createPersonsMap(); // (key: last name, val: first name)
        displayEntities(personsList);

        System.out.println(atLeastTwoPersonsWithSameName(personsList));

        removePersonsByFirstName(personsList, "Vlad");
        displayEntities(personsList);
    }

    public static boolean removePersonsByFirstName(Map<String,String> personsMap ,String name){
        boolean wasRemoved = false;
        while (personsMap.values().remove(name)) wasRemoved = true;
        return wasRemoved;
    }

    public static boolean atLeastTwoPersonsWithSameName(Map<String,String> personsMap){
        Set<String> firstNames = new HashSet<>(personsMap.values());
        //if the firstNames set size will not be equals to map size, then
        //we can say that the personsMap map contains at least two same first names, so
        //return false
        return firstNames.size() != personsMap.size();
    }

    public static void displayEntities(Map<String,String> persons){
        for(Map.Entry<String, String> entry : persons.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
    private static Map<String, String> createPersonsMap(){
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("Siverskyi", "Vlad");
        tempMap.put("Cymbal", "Oleh");
        tempMap.put("Pasichnyi", "Sergiy");
        tempMap.put("Boyko", "Nazar");
        tempMap.put("Rudko", "Orest");
        tempMap.put("Mospan", "Andriy");
        tempMap.put("Fediyk", "Olexiy");
        tempMap.put("Yakumiv", "Julia");
        tempMap.put("Marchuk", "Marta");
        tempMap.put("Karpenko", "Vlad");
        return tempMap;
    }
}
