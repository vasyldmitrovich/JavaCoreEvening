package com.softserve.edu10.PracticalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Map<Integer, String> employeeMap = declareMap();
        System.out.println(employeeMap);

        findCorrespondingName(employeeMap);

        findCorrespondingID(employeeMap);
    }

    public static Map<Integer, String> declareMap(){
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Accountant");
        employeeMap.put(2, "Builder");
        employeeMap.put(3, "Designer");
        employeeMap.put(4, "Engineer");
        employeeMap.put(5, "Journalist");
        employeeMap.put(6, "Policeman");
        employeeMap.put(7, "Teacher");
        return employeeMap;
    }

    public static void findCorrespondingName(Map<Integer, String> employeeMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ID:");
        int id = sc.nextInt();
        if (employeeMap.containsKey(id)){
            System.out.println(employeeMap.get(id));
        }
        else {
            System.out.println("can't find this ID");
        }
    }

   public static void findCorrespondingID(Map<Integer, String> employeeMap){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter Name:");
       String name = sc.nextLine();
       for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
           if (employeeMap.containsValue(name)){
               System.out.println(entry.getKey());
               break;
           }
           else {
               System.out.println("can't find this name");
               break;
           }
       }
   }


}
