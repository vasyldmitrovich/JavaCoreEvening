package com.softserve.edu10.practicalTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runMap();
    }

    static void runMap() {
        Map<Integer, String> employeeMap = new HashMap<>();
        addEmployee(employeeMap);
        findById(employeeMap);
        findByName(employeeMap);
    }

    static void addEmployee(Map<Integer, String> map) {
        map.put(123, "Asdd");
        map.put(124, "Asds");
        map.put(125, "Asdq");
        map.put(126, "Asd4");
        map.put(127, "Asdj");
        map.put(128, "Asdl");
        map.put(129, "Asd9");
    }

    static void findById(Map<Integer, String> map) {
        System.out.println("Enter id of employee");
        int id = new Scanner(System.in).nextInt();
        System.out.println(map.getOrDefault(id, "There is no such employee"));
    }

    static void findByName(Map<Integer, String> map) {
        boolean found = false;
        System.out.println("Enter name of employee");
        String name = new Scanner(System.in).nextLine();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(name)) {
                System.out.println("Id of " + name + " is " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("There is no such employee");
    }
}
