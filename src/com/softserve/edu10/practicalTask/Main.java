package com.softserve.edu10.practicalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Map<Integer, String> employeesMap = createEmployeeMap();
        System.out.println(employeesMap);

        System.out.println(getEmployeeById(employeesMap, askId()));
        System.out.println(getIdByEmployeeName(employeesMap, askName()));
    }

    public static int getIdByEmployeeName(Map<Integer, String> employees, String employeeName){
        for(Map.Entry<Integer, String> pair: employees.entrySet()){
            if(pair.getValue().equals(employeeName)){
                return pair.getKey();
            }
        }
        return -1; // if no employee with such name;
    }

    public static String getEmployeeById(Map<Integer, String> employees, int id){
        if(employees.containsKey(id)) return employees.get(id);
        return "Can`t find such id";
    }

    private static Scanner getInput(){
        return new Scanner(System.in);
    }

    private static int askId(){
        System.out.println("Enter employee`s id number: ");
        return getInput().nextInt();
    }

    private static String askName(){
        System.out.println("Enter employee`s name: ");
        return getInput().nextLine();
    }


    public static Map<Integer, String> createEmployeeMap(){
        Map<Integer, String> tempMap = new HashMap<>();
        tempMap.put(101, "Vladyslav");
        tempMap.put(102, "Vitaliy");
        tempMap.put(103, "Vasyl");
        tempMap.put(104, "Orest");
        tempMap.put(105, "Anna");
        tempMap.put(106, "Serhiy");
        tempMap.put(107, "Oleh");
        return tempMap;
    }
}
