package com.softserve.edu10.PracticalTask;

import java.util.Map;

import static com.softserve.edu10.PracticalTask.Employee.*;

public class main {
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
