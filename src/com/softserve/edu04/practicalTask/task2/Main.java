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
                printLanguages(Languages.FIRST_DAY);
                break;
            case 2:
                printLanguages(Languages.SECOND_DAY);
                break;
            case 3:
                printLanguages(Languages.THIRD_DAY);
                break;
            case 4:
                printLanguages(Languages.FOURTH_DAY);
                break;
            case 5:
                printLanguages(Languages.FIFTH_DAY);
                break;
            case 6:
                printLanguages(Languages.SIXTH_DAY);
                break;
            case 7:
                printLanguages(Languages.SEVENTH_DAY);
                break;
            default:
                System.out.println("Wrong enter data...");
        }
    }

    public static void printLanguages(Languages language){
        System.out.println(language.getEngLang());
        System.out.println(language.getDeuLang());
    }
}
