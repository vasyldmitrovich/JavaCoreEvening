package com.softserve.edu05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * HOMEWORK
 * Ask user to enter the number of month. Read the value and write the number of days in
 * this month (create array with amount days of each month)
 */
public class Edu05Part3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter one of twelve months: ");
        int month = Integer.parseInt(bufferedReader.readLine());
        /*For resolve that task you should create Enum month and compare data from user, what user input, is that correct enum*/
        String[] months = {"January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("The month you entered is: " + months[month - 1]);
    }
}
