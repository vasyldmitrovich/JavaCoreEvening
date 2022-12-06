package com.softserve.edu04.PracticalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you number between 1-7:");
        int number = Integer.parseInt(br.readLine());
        switch (number) {
            case 1 -> {
                System.out.println(daysOfTheWeek.First.getEnglish());
                System.out.println(daysOfTheWeek.First.getGerman());
            }
            case 2 -> {
                System.out.println(daysOfTheWeek.Second.getEnglish());
                System.out.println(daysOfTheWeek.Second.getGerman());
            }
            case 3 -> {
                System.out.println(daysOfTheWeek.Third.getEnglish());
                System.out.println(daysOfTheWeek.Third.getGerman());
            }
            case 4 -> {
                System.out.println(daysOfTheWeek.Fourth.getEnglish());
                System.out.println(daysOfTheWeek.Fourth.getGerman());
            }
            case 5 -> {
                System.out.println(daysOfTheWeek.Fifth.getEnglish());
                System.out.println(daysOfTheWeek.Fifth.getGerman());
            }
            case 6 -> {
                System.out.println(daysOfTheWeek.Sixth.getEnglish());
                System.out.println(daysOfTheWeek.Sixth.getGerman());
            }
            case 7 -> {
                System.out.println(daysOfTheWeek.Seventh.getEnglish());
                System.out.println(daysOfTheWeek.Seventh.getGerman());
            }
            default -> System.out.println("Wrong number, please enter the number between 1-7");
        }
    }
}
