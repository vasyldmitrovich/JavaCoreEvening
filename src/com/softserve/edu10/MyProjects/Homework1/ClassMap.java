package com.softserve.edu10.MyProjects.Homework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ClassMap {

    private Map<String, String> person;

    public ClassMap(Map<String, String> person) {
        this.person = person;
    }

    public void printMap() {
        for(Map.Entry<String, String> entry : person.entrySet()) {
            System.out.println("Last name = " + entry.getKey() + ", first name = " + entry.getValue());
        }
    }

    public void findDuplicateFirstName () {
//        Set<Object> uniqueValues = new HashSet<Object>(person.values());
//        System.out.println(uniqueValues);

        Map<String, String> duplicatMap = new HashMap<>();
        int index = 0;
        String value, key;

        for(Map.Entry<String, String> entry: person.entrySet()) {
            value = entry.getValue();
            key = entry.getKey();
            if(duplicatMap.containsKey(value) ) {
                duplicatMap.put(value, key);
                index++;
            } else {
                duplicatMap.put(value, key);
            }
        }

        if (index <= 1) {
            System.out.println("\nThere are at less two persons with the same firstName");
        } else {
            System.out.println("\nThere are at more two persons with the same firstName");
        }
    }

    public void removeByFirstName(String value) {
        Iterator<Map.Entry<String, String>> iterator = person.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(value))
                iterator.remove();
        }
    }

}
