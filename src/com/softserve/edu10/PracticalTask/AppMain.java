package com.softserve.edu10.PracticalTask;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(111, "Nazar");
        employeeMap.put(222, "Oleg");
        employeeMap.put(333, "Marik");
        employeeMap.put(444, "Dima");
        employeeMap.put(555, "Olya");
        employeeMap.put(666, "Sasha");
        employeeMap.put(777, "Ira");
        System.out.println(employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id.");
        try {
            int a = scanner.nextInt();
            if (employeeMap.containsKey(a)) {
                System.out.println("Employee name: " + employeeMap.get(a));
            } else {
                System.out.println("No such key.");
            }
        } catch (Exception e) {
            System.out.println("You have to input integer!");
        }

        System.out.println("Enter employee name.");
        try {
            String e = scanner.next();
            if (employeeMap.containsValue(e)) {
                for (Map.Entry<Integer, String> m : employeeMap.entrySet()) {
                    if (m.getValue().equals(e)) {
                        System.out.println("Employee Id: " + m.getKey());
                        break;
                    }
                }
            } else {
                System.out.println("No such name.");
            }
        } catch (Exception e) {
            System.out.println("You have to input string!");
        }
        scanner.close();
    }
}
