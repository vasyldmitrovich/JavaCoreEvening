package com.softserve.edu10.HomeTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        //useSetApp();

        useMapApp();
    }

    public static void useSetApp(){
        Set<String> set1 = SetApp.createSet1();
        Set<String> set2 = SetApp.createSet2();

        set1 = SetApp.union(set1, set2);

        SetApp.printSet(set1, "After union");

        System.out.println();
        set1 = SetApp.intersect(set1, set2);

        SetApp.printSet(set1, "After intersect");
    }

    public static void useMapApp(){
        Map<String, String> mapPerson = MapApp.createMap();

        MapApp.printMap(mapPerson);

        System.out.println();
        MapApp.findDuplicateFirstName(mapPerson);

        String name = "Luna";
        mapPerson = MapApp.removePersonByName(mapPerson, name);
        System.out.println("\nMap after removing person with name "+name+":");
        MapApp.printMap(mapPerson);

    }
}
