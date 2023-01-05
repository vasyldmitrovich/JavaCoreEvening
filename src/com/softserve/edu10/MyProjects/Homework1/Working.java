package com.softserve.edu10.MyProjects.Homework1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Working {
    private Map<String, String> person;

    public Working () {}

    public Working(Map<String, String> person) {
        this.person = person;
    }


    public boolean union(Set set1, Set set2) {
        return set1.addAll(set2);
    }

    public boolean intersect(Set set1, Set set2) {
        return set1.retainAll(set2);
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
                duplicatMap.put(value, key);// duplicatMap.get(value)+ ", " + key);
                index++;
            } else {
                duplicatMap.put(value, key);
            }
        }

        if (index <= 1) {
            System.out.println("There are at less two persons with the same firstName");
        } else {
            System.out.println("There are at more two persons with the same firstName");
        }
    }

    public void removeFirstName(String firstName) {
//        for(Map.Entry<String, String> entry : person.entrySet()) {
//            if (entry.getValue().equals(firstName)) {
                person.remove(1);
//            }
//        }
        System.out.println(person);
    }



}
