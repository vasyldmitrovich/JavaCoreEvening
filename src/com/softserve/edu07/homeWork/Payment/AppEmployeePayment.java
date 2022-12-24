package com.softserve.edu07.homeWork.Payment;

import java.util.Arrays;

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
