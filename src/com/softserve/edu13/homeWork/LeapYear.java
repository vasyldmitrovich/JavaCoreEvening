package com.softserve.edu13.homeWork;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public void checkLeapYear(){
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Введіть рік: ");
        Integer year = inputYear.nextInt();
        LocalDate yearL = LocalDate.of(year, 1, 1);
        if (yearL.isLeapYear()){
            System.out.println("Цей рік є високосним");
        } else{
            System.out.println("Цей рік не є високосним");
        }
        inputYear.close();
    }

    public static void main(String[] args) {
        LeapYear lp = new LeapYear();
        lp.checkLeapYear();
    }
}
