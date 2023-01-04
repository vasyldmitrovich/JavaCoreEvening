package com.softserve.edu10.MyProjects.PracticalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(0, "Bob Sting");
        employeeMap.put(1, "Bill Still");
        employeeMap.put(2, "Vasyl Zubriv");
        employeeMap.put(3, "Mark Prokopenko");
        employeeMap.put(4, "Max Zayets");
        employeeMap.put(5, "Borys Santa");
        employeeMap.put(6, "Dmytro Shylyak");
        employeeMap.put(7, "Dmytro Shylyak");


//        System.out.println(employeeMap);
        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int key = -1;
        do {
            System.out.print("Enter key: ");
            key = Integer.parseInt(br.readLine());

            if(employeeMap.containsKey(key)) {
                System.out.print(employeeMap.get(key) + "\n");
            } else {
                System.out.print("Wrong key\n");
            }
        } while (employeeMap.containsKey(key));



/*        String value = "";
        System.out.print("Enter value: ");
        value = br.readLine();

        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().contains(value)) {
                System.out.println("Key = " + entry.getKey());
                break;
            }
        }*/

        String value = "";
        System.out.print("Enter value: ");
        value = br.readLine();

        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equals(value)) {
                System.out.println("Key = " + entry.getKey());
            }
        }

    }
}
