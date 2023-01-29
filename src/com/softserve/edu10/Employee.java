package com.softserve.edu10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static Map<Integer, String> newMap(){
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Tom");
        employeeMap.put(2, "Zlata");
        employeeMap.put(3, "Nick");
        employeeMap.put(4, "Ernest");
        employeeMap.put(5, "Solomia");
        employeeMap.put(6, "Yura");
        employeeMap.put(7, "Stepan");
        return employeeMap;
    }

    public static void findByID(Map<Integer, String> employeeMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        System.out.println(employeeMap.getOrDefault(id, "ID not found"));
    }

    public static void findByName(Map<Integer, String> employeeMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if (employeeMap.containsValue(name)){
                System.out.println(entry.getKey());
            }
            else {
                System.out.println("The given name was not found!");
            }
            break;
        }
    }
}