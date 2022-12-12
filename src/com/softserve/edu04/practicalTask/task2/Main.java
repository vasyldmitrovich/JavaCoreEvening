package com.softserve.edu04.practicalTask.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner dayScanner = new Scanner(System.in);

        System.out.println("Enter day of the week number: ");
        switch (dayScanner.nextInt()){
            case 1:
                System.out.println(Languages.FIRST_DAY.getDeuLang());
                System.out.println(Languages.FIRST_DAY.getEngLang());
                break;
            case 2:
                System.out.println(Languages.SECOND_DAY.getDeuLang());
                System.out.println(Languages.SECOND_DAY.getEngLang());
                break;
            case 3:
                System.out.println(Languages.THIRD_DAY.getDeuLang());
                System.out.println(Languages.THIRD_DAY.getEngLang());
                break;
            case 4:
                System.out.println(Languages.FOURTH_DAY.getDeuLang());
                System.out.println(Languages.FOURTH_DAY.getEngLang());
                break;
            case 5:
                System.out.println(Languages.FIFTH_DAY.getDeuLang());
                System.out.println(Languages.FIFTH_DAY.getEngLang());
                break;
            case 6:
                System.out.println(Languages.SIXTH_DAY.getDeuLang());
                System.out.println(Languages.SIXTH_DAY.getEngLang());
                break;
            case 7:
                System.out.println(Languages.SEVENTH_DAY.getDeuLang());
                System.out.println(Languages.SEVENTH_DAY.getEngLang());
                break;
            default:
                System.out.println("Wrong enter data...");
        }
    }
}
