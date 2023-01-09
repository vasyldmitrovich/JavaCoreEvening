package com.softserve.edu10.PracticalTask;

import com.softserve.service.MyScanner;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        HashMap<Integer, String> employeeMap;

        employeeMap = createEmployeeMap();
        for (Map.Entry<Integer, String> empEntry: employeeMap.entrySet()){
            System.out.println(empEntry.getKey()+": "+empEntry.getValue());
        }

        System.out.println();
        findNameByID(employeeMap);

        System.out.println();
        findIdByName(employeeMap);
    }

    public static HashMap<Integer, String> createEmployeeMap(){
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Igor");
        employeeMap.put(124, "Olga");
        employeeMap.put(125, "Maria");
        employeeMap.put(126, "Kira");
        employeeMap.put(127, "Taras");
        employeeMap.put(128, "Bogdan");
        employeeMap.put(129, "Zlata");

        return employeeMap;
    }

    public static void findNameByID(HashMap<Integer, String> employeeMap){
        try {
            int id = MyScanner.writeInputInt("Enter ID");

            if (employeeMap.containsKey(id)){
                System.out.println("Name: "+employeeMap.get(id));
            }else {
                System.out.println("ID "+id+" didn't find.");
            }
        }
        catch (NumberFormatException exception){
          System.out.println("Invalid ID");
        }
    }

    public static void findIdByName(HashMap<Integer, String> employeeMap){
        String name = MyScanner.writeInputString("Enter name");
        if (employeeMap.containsValue(name)){
            for (Map.Entry<Integer,String> empEntry: employeeMap.entrySet()){
                if (empEntry.getValue().equals(name)){
                    System.out.println("ID: "+empEntry.getKey());
                }
            }
        }else {
            System.out.println("Name "+name+" didn't find.");
        }
    }
}
