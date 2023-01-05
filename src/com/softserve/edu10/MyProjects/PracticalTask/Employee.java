package com.softserve.edu10.MyProjects.PracticalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Employee {

    public Employee () {

    }

    public void print(Map<Integer, String> employeeMap) {
        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    public void findValue(Map<Integer, String> employeeMap) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int key = -1;

        do {
            System.out.print("Enter key: ");
            key = Integer.parseInt(br.readLine());

            if (employeeMap.containsKey(key)) {
                System.out.print(employeeMap.get(key) + "\n");
            } else {
                System.out.print("Wrong key\n");
            }
        } while (employeeMap.containsKey(key));
    }

    public void findKey(Map<Integer, String> employeeMap) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = "";
        System.out.print("Enter value: ");
        value = br.readLine();

        if (employeeMap.containsValue(value)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(value)) {
                    System.out.println("Key = " + entry.getKey());
                }
            }
        } else {
            System.out.println("Wrong value");
        }
    }
}
