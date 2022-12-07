package com.softserve.edu04.MyProjects.PracticalTask2;

/*Practical task. Enter the number of the day of the week. Display the name in two languages.
Roman Sitko */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number by word and small letters");
        String word = br.readLine();

        switch (word) {
            case "one":
                Day day1 = Day.ONE;
                System.out.println(day1.getEn() + ", " + day1.getUa());
                break;
            case "two":
                Day day2 = Day.TWO;
                System.out.println(day2.getEn() + ", " + day2.getUa());
                break;
            case "three":
                Day day3 = Day.THREE;
                System.out.println(day3.getEn() + ", " + day3.getUa());
                break;
            case "four":
                Day day4 = Day.FOUR;
                System.out.println(day4.getEn() + ", " + day4.getUa());
                break;
            case "five":
                Day day5 = Day.FIVE;
                System.out.println(day5.getEn() + ", " + day5.getUa());
                break;
            case "six":
                Day day6 = Day.SIX;
                System.out.println(day6.getEn() + ", " + day6.getUa());
                break;
            case "seven":
                Day day7 = Day.SEVEN;
                System.out.println(day7.getEn() + ", " + day7.getUa());
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
