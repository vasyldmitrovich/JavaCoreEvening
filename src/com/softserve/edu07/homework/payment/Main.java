package com.softserve.edu07.homework.payment;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        employee();
    }

    public static void employee() {

        Employee[] employees = {new ContractEmployee("Michael", 47852, 31547845, 2400),
                new ContractEmployee("Robert", 25784, 28453045, 2750),
                new ContractEmployee("John", 36547, 29015483, 2700),
                new SalariedEmployee("Mary", 62547, "365-55-4784", 9, 240),
                new SalariedEmployee("Patricia", 42550, "542-71-1094", 6, 275),
                new SalariedEmployee("Jennifer", 39558, "447-52-2549", 11, 235)};

        Arrays.sort(employees, new SortSalary());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }


}
