package com.softserve.edu13.HomeTask;

import com.softserve.service.MyScanner;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.function.Function;
import java.util.function.Predicate;


public class HomeTask {
    public static void main(String[] args) {
        go();
    }

    public static void go(){

        codingString();

        System.out.println();
        doTaskLeapYear();

        System.out.println();
        doTaskDaysOfWeekBirthday();

        System.out.println();
        validateDate();
    }

    public static void codingString(){
        int n =0;

        String s = MyScanner.writeInputString("Input string");
        try {
            n = MyScanner.writeInputInt("Input step of moving");
        }
        catch (NumberFormatException exception){
            System.out.println("Invalid value");
        }

        s = encrypt(s, n);
        System.out.println("Coded string: "+s);
        s = decrypt(s, n);
        System.out.println("Decoded string: "+s);
    }

    public static String encrypt(String s, int n){

        StringBuffer newS = new StringBuffer();

        Predicate<Integer> predicate = x-> (x>=97 & x<=122)|(x>=65 & x<=90);

        char c;

        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i);
            if (predicate.test(code)) {
              if (predicate.test(code+n)){
              c = (char) (code+n);}
              else {
                  c = (char) (code+n-26);
              }
             newS.append(c);
            }
            else {
              newS.append(s.charAt(i));
            }
        }
        return newS.toString();
    }

    public static String decrypt(String s, int n){

        StringBuffer newS = new StringBuffer();

        Predicate<Integer> predicate = x-> (x>=97 & x<=122)|(x>=65 & x<=90);

        char c;

        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i);
            if (predicate.test(code)) {
                if (predicate.test(code-n)){
                    c = (char) (code-n);}
                else {
                    c = (char) (code-n+26);
                }
                newS.append(c);
            }
            else {
                newS.append(s.charAt(i));
            }
        }
        return newS.toString();
    }

    public static void doTaskLeapYear(){

        try {
            int year = MyScanner.writeInputInt("Input year");
            if (isYearLeap(year)){
                System.out.println("Year is leap");
            }
            else {
                System.out.println("Year isn't leap");
            }
        }
        catch (NumberFormatException exception){
            System.out.println("Invalid value of year");
        }
    }

    public static boolean isYearLeap(int year){
        LocalDate ld = LocalDate.of(year,1,1);
        return ld.isLeapYear();
    }

    public static void doTaskDaysOfWeekBirthday(){
        LocalDate birthday = LocalDate.of(2023,3,7);

        printDaysOfWeek(birthday);
    }

    public static void printDaysOfWeek(LocalDate birthday){
        System.out.println(birthday);
        System.out.println("Day of the week "+birthday.getDayOfWeek());
        System.out.println("Day of the week after 6 month "+birthday.plusMonths(6).getDayOfWeek());
        System.out.println("Day of the week after 12 month "+birthday.plusMonths(12).getDayOfWeek());
    }

    public static void validateDate(){
        String strDate = MyScanner.writeInputString("Input date in format mm.dd.yy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try{
            LocalDate parseDate = LocalDate.parse(strDate, formatter);
            System.out.println("Date is validate");
        }
        catch (DateTimeException e){
            System.out.println("Date isn't validate");
        }
    }
}
