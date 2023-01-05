package com.softserve.edu10.MyProjects.Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        //toDoSet();
        toDoMap();


    }

    public static void toDoSet() throws IOException {

        Working workingSet = new Working();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set1 = " + set1);
        System.out.println("Set2 = " + set2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Chose num: 1-union, 2-intersect: ");
        int number = Integer.parseInt(br.readLine());

        switch (number) {
            case 1:
                boolean b1 = workingSet.union(set1, set2);
                System.out.println("set1.addAll(set2) = " + b1 + ", Set1 = " + set1);
                break;
            case 2:
                boolean b2 = workingSet.intersect(set1, set2);
                System.out.println("set1.retainAll(set2) = " + b2 + ", Set1 = " + set1);
                break;
            default:
                System.out.println("Wrong num");
        }
    }


    public static void toDoMap() {
        Map<String, String> personalMap = new HashMap<>();
        personalMap.put("Karp", "Ira");
        personalMap.put("Sting", "Bob");
        personalMap.put("Still", "Bill");
        personalMap.put("Zubriv", "Vasyl");
        personalMap.put("Prokopenko", "Mark");
        personalMap.put("Zayets", "Max");
        personalMap.put("Santa", "Borys");
        personalMap.put("Shylyak", "Dmytro");
        personalMap.put("Girko", "Orest");
        personalMap.put("Pirko", "Orest");
        personalMap.put("Kirko", "Orest");
        personalMap.put("Tytuf", "Oleg");


        Working workingMap = new Working(personalMap);
        workingMap.printMap();
        //workingMap.findDuplicateFirstName();
        workingMap.removeFirstName("Ira");


    }


}
