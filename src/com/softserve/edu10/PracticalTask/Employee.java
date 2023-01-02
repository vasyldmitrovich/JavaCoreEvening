package com.softserve.edu10.PracticalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static Map<Integer, String> newMap(){
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Іван");
        employeeMap.put(2, "Ольга");
        employeeMap.put(3, "Ярик");
        employeeMap.put(4, "Руслан");
        employeeMap.put(5, "Анна");
        employeeMap.put(6, "Роман");
        employeeMap.put(7, "Сергій");
        return employeeMap;
    }

    public static void findByID(Map<Integer, String> employeeMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ID:");
        int id = sc.nextInt();
        if (employeeMap.containsKey(id)){
            System.out.println(employeeMap.get(id));
        }
        else {
            System.out.println("ID не знайдено");
        }
    }

    public static void findByName(Map<Integer, String> employeeMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ім*я:");
        String name = sc.nextLine();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if (employeeMap.containsValue(name)){
                System.out.println(entry.getKey());
                break;
            }
            else {
                System.out.println("Вказане ім*я не знайдено");
                break;
            }
        }
    }
}
