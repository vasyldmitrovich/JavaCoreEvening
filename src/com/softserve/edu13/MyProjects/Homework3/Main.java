package com.softserve.edu13.MyProjects.Homework3;
/* Roman Sitko
* Lesson 14, Homework 3
* */
import java.time.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(isLeap(2023));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean isLeap(int year) throws Exception {
        if(year <= 0 || year > 9999) {
            throw new Exception("Year should be between 0 and 9999");
        }
        return Year.of(year).isLeap();
    }

}
