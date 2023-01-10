package com.softserve.edu13.homeTask;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt("def", 3));

        System.out.println(validateTime("12.31.22"));

        int year = 2001;
        System.out.println(isLeapYear(LocalDate.of(year, 1, 1)));

        LocalDate date = LocalDate.of(2004, 2, 14);

        printDays(date);

    }

    static String encrypt(String s, int n) {
        StringBuilder newString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            ch += n;
            newString.append(ch);

        }
        return newString.toString();
    }

    static String decrypt(String s, int n) {
        StringBuilder newString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            ch -= n;
            newString.append(ch);

        }
        return newString.toString();
    }

    static boolean validateTime(String time) {
        String regex = "(0[0-9]|1[0-2]).([0-2][0-9]|3[0-1]).(\\d{2})"; //Змінюємо останню цифру - змінюємо кількість цифр в році
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(time);
        return m.matches();


    }

    static boolean isLeapYear(LocalDate date) {
        return date.isLeapYear();
    }

    static void printDays(LocalDate date) {
        System.out.println(date.getDayOfWeek());
        System.out.println(date.plusMonths(6).getDayOfWeek());
        System.out.println(date.plusYears(1).getDayOfWeek());
    }
}
