package com.softserve.edu11.practicalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        runFirst();
        runSecond();
        runThird();
    }

    static void runFirst() {
        String subLine = scan.nextLine();
        String line = scan.nextLine();
        System.out.println(line + " contains " + subLine);
        System.out.println(line.contains(subLine));
    }

    static void runSecond() {
        System.out.println("Enter surname name and patronymic");
        String name = scan.nextLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(name.split("\\W+")));
        StringBuilder initials = new StringBuilder();
        for (String names : arr) {
            if (!names.matches("[a-zA-Z]+") || arr.size() != 3) {
                System.out.println("Bad input");
                return;
            }
        }
        for (String names : arr) {
            initials.append(names.charAt(0));
        }
        System.out.printf("Surname - %s, Initials - %s \n", arr.get(0), initials.toString().toUpperCase());
        System.out.printf("Name - %s \n", arr.get(1));
        System.out.printf("Name - %s, Middle name - %s, Last name - %s \n", arr.get(1), arr.get(2), arr.get(0)); //Де вязти Middle name, це, по факту, друге ім'я, а patronymic це по батькові
    }

    static void runThird() {
        int i = 0;
        while (i != 5) {
            String username = scan.nextLine();
            Pattern pattern = Pattern.compile("[\\w_]{3,15}");
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println("Valid username");
            } else System.out.println("Not valid username");
            i++;
        }
    }
}
