package com.softserve.edu10.practicalTask;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(0, "Ivan Ivanov");
        employeeMap.put(1, "Petro Petrov");
        employeeMap.put(2, "Polina Kilat");
        employeeMap.put(3, "Olha Ilkiv");
        employeeMap.put(4, "Vladyslav Kuljak");
        employeeMap.put(5, "Oleh Tkachenko");
        employeeMap.put(6, "Iryna Vilde");

        for (Map.Entry<Integer, String> entry: employeeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        UserEnter.UserEnterNum("________________________________\nВведіть id працівника: ");
        Integer id = (Integer) UserEnter.numb;


        if (employeeMap.containsKey(id)) {
            System.out.println("\nІм'я працівника : " + employeeMap.get(id));
        } else {
            System.out.println("\nПрацівника з даним id не створено");
        }

        UserEnter.UserEnter("\n________________________________\nВведіть ім'я працівника: ");
        String name = UserEnter.inform;

        if(employeeMap.containsValue(name)){
        for (Map.Entry<Integer, String> entryName: employeeMap.entrySet()){
            if(entryName.getValue().equals(name)){
                System.out.println("\nid працівника : " + entryName.getKey());
              }
            }
        }else{
                System.out.println("\nПрацівника з даним ім'ям не створено");
        }

    }
}
