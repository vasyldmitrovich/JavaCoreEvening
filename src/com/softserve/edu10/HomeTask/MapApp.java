package com.softserve.edu10.HomeTask;

import java.util.*;

public class MapApp {
    public static Map createMap(){
        Map<String, String> mapPerson= new HashMap<>();

        mapPerson.put("Potter","Harry");
        mapPerson.put("Weasley","Ron");
        mapPerson.put("Granger ","Hermione");
        mapPerson.put("Lovegood","Luna");
        mapPerson.put("Chang","Cho");
        mapPerson.put("Diggory","Cedric");
        mapPerson.put("Krum","Victor");
        mapPerson.put("Longbottom","Neville");
        mapPerson.put("Malfoy ","Draco");
        mapPerson.put("Patil","Parvati");

        return mapPerson;
    }

    public static void printMap(Map<String, String> mapPerson){
        for (Map.Entry entry: mapPerson.entrySet()){
            System.out.println("Last name: "+entry.getKey()+" , First name: "+entry.getValue());
        }
    }

    public static void findDuplicateFirstName(Map<String, String> mapPerson){
        Collection<String> tmpCol = mapPerson.values();

        String name;
        boolean isDuplicate = false;

        for (Map.Entry entry: mapPerson.entrySet()){
            name = (String) entry.getValue();
            if (Collections.frequency(tmpCol, name)>1){
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate){
            System.out.println("Duplicate names is finding.");
        }else {
            System.out.println("Duplicate names isn't find.");
        }
    }

    public static Map<String, String> removePersonByName(Map<String, String> mapPerson, String name){
        if (mapPerson.containsValue(name)){
            for (Map.Entry entry: mapPerson.entrySet()){
                if (entry.getValue() == name){
                    mapPerson.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
        }

        return mapPerson;
    }

}
