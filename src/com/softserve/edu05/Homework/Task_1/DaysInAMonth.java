package com.softserve.edu05.Homework.Task_1;

import java.util.Scanner;

public class DaysInAMonth {

    public int inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number.");
        int a = scanner.nextInt();
        scanner.close();
        return a;
    }

    public int whichMonth(int a) {
        int[] whichMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30 , 31};
        if (a < 0 | a > 12) {
            return  -1;
        } else {
            return  whichMonth[a - 1];
        }
    }

    public String daysInAMonth(){
        int a = whichMonth(inPut());
        if (a != -1) {
            return "Selected month contains " + a + " days.";
        }else {
            return "Incorrect month number.";
        }
    }
    public static void main(String[] args) {
        DaysInAMonth daysInAMonth = new DaysInAMonth();
        System.out.println(daysInAMonth.daysInAMonth());
    }
}
