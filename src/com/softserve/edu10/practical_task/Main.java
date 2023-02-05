package com.softserve.edu10.practical_task;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        key();
        value();
    }

    private static void value() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Tom");
        employeeMap.put(2, "Alex");
        employeeMap.put(3, "Nike");
        employeeMap.put(4, "Bob");
        employeeMap.put(5, "Sara");
        employeeMap.put(6, "David");
        employeeMap.put(7, "Nik");
        System.out.println(employeeMap.entrySet());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value: ");
        String value = scanner.next();

        if (employeeMap.containsValue(value)) {
            for (Map.Entry<Integer, String> map : employeeMap.entrySet()) {
                if (map.getValue().equals(value)) {
                    System.out.println("The ID of the value you entered is: " + map.getKey());
                }
            }
        } else {
            System.out.println("Value not found");
        }
    }

    private static void key() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Tom");
        employeeMap.put(2, "Alex");
        employeeMap.put(3, "Nike");
        employeeMap.put(4, "Bob");
        employeeMap.put(5, "Sara");
        employeeMap.put(6, "David");
        employeeMap.put(7, "Nik");
        System.out.println(employeeMap.entrySet());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int iD;

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        iD = scanner.nextInt();

        if (employeeMap.containsKey(iD)) {
            System.out.println("The value of the ID you entered is: " + employeeMap.get(iD));
        } else {
            System.out.println("ID not found");
        }
    }
}

