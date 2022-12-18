package com.softserve.edu04;

import java.util.Scanner;

/**
 * PRACTICAL TASKS
 * Enter the number of the day of the week.Display the name in two languages
 */
public class Edu04Part2 {
    public static void main(String[] args) {
        dayWeek(number());
    }

    public static int number() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a day of week from 1 to 7");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right number");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void dayWeek(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday/" + "Понедельник");
            case 2 -> System.out.println("Tuesday/" + "Вторник");
            case 3 -> System.out.println("Wednesday/" + "Среда");
            case 4 -> System.out.println("Thursday/" + "Четверг");
            case 5 -> System.out.println("Friday/" + "Пятница");
            case 6 -> System.out.println("Saturday/" + "Суббота");
            case 7 -> System.out.println("Sunday/" + "Воскресенье");
            default -> System.out.println("You entered the wrong day of the week");
        }
    }
}

