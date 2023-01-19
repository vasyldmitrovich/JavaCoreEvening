package com.softserve.edu10;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[] args) {


        Map<Integer, String> employee = new HashMap<>();
        employee.put(246, "Mark");
        employee.put(247, "Ihor");
        employee.put(248, "Mary");
        employee.put(249, "Marta");
        employee.put(250, "Alex");
        employee.put(251, "Alex");
        employee.put(252, "Oleg");

        System.out.println(employee);

        findID(employee);
        findName(employee);
    }

    public static void findID(Map<Integer, String> empl) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter ID of the employee:");
            int ID = sc.nextInt();
            System.out.println(empl.getOrDefault(ID, " Can't find this ID, try another one..."));
        } catch (InputMismatchException e) {
            System.out.println("ID must be a number...");
        }
    }

    public static void findName(Map<Integer, String> empl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter NAME of the employee:");
        String name = sc.nextLine();
        boolean find = false;
        for (Map.Entry<Integer, String> e : empl.entrySet()) {
            if (e.getValue().equalsIgnoreCase(name)) {
                System.out.println(name+"'s " + " ID is " + e.getKey());
                find = true;}
        } if (!find) {
            System.out.println("Can't find this NAME, try another one...");
        }
    }
}
