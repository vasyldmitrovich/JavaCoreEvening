package com.softserve.edu07.homeWork;

import java.util.Arrays;
import java.util.Comparator;

public class AppEmployeePayment{
    public static void main(String[] args) {
        Employee[] arr = {
                new SalariedEmployee("Ilchenko Andriy"),
                new ContractEmployee("Omelko Ivan"),
                new SalariedEmployee("Topolja Iryna")
        };

        Arrays.sort(arr);
        for (Employee i : arr) {
            System.out.println(i);
        }
    }
}
