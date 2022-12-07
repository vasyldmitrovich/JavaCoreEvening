package com.softserve.edu04.MyProjects.PracticalTask2;

/*Practical task 2. Enter the number of the day of the week. Display the name in two languages.
Roman Sitko */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of day from 1 to 7");
        int number = Integer.parseInt(br.readLine());

        switch (number) {
            case 1:
                Day day1 = Day.ONE;
                System.out.println(day1.getEn() + ", " + day1.getUa());
                break;
            case 2:
                Day day2 = Day.TWO;
                System.out.println(day2.getEn() + ", " + day2.getUa());
                break;
            case 3:
                Day day3 = Day.THREE;
                System.out.println(day3.getEn() + ", " + day3.getUa());
                break;
            case 4:
                Day day4 = Day.FOUR;
                System.out.println(day4.getEn() + ", " + day4.getUa());
                break;
            case 5:
                Day day5 = Day.FIVE;
                System.out.println(day5.getEn() + ", " + day5.getUa());
                break;
            case 6:
                Day day6 = Day.SIX;
                System.out.println(day6.getEn() + ", " + day6.getUa());
                break;
            case 7:
                Day day7 = Day.SEVEN;
                System.out.println(day7.getEn() + ", " + day7.getUa());
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
