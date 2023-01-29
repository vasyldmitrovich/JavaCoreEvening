package com.softserve.edu10;

import java.util.Map;

import static com.softserve.edu10.Employee.*;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Map<Integer, String> employeeMap = newMap();
        System.out.println(employeeMap);

        findByID(employeeMap);

        findByName(employeeMap);

    }
}