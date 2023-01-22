package com.softserve.edu04.PracticalTask.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int DayOfWeek = Integer.parseInt(br.readLine());
        System.out.println("Enter number of the day:");

        switch (DayOfWeek) {
            case 1 -> System.out.println("Your day is: " + Week.First.getEn()+"," + Week.First.getUa());


            case 2 -> System.out.println("Your day is: " + Week.Second.getEn() +","+ Week.Second.getUa());


            case 3 -> System.out.println("Your day is: " + Week.Third.getEn()+"," + Week.Third.getUa());


            case 4 -> System.out.println("Your day is: " + Week.Fourth.getEn()+"," + Week.Fourth.getUa());


            case 5 -> System.out.println("Your day is: " + Week.Fifth.getEn() +","+ Week.Fifth.getUa());


            case 6 -> System.out.println("Your day is: " + Week.Sixth.getEn() +","+ Week.Sixth.getUa());


            case 7 -> System.out.println("Your day is: " + Week.Seventh.getEn()+"," + Week.Seventh.getUa());


            default -> System.out.println("Error! Incorrect number!!!");

        }

    }
}
