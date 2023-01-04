package com.softserve.edu11.homeTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        //Implement a pattern for US currency: the first symbol "$", then any number of digits,
        // dot and two digits after the dot.
        // Enter the text from the console that contains several occurrences of US currency.
        // Display all occurrences on the screen
        System.out.println("Enter text that contains US currency (for example, we paid for the car $5000.20)");
        String str = new Scanner(System.in).nextLine();

        findOccurrencesOfUSCurrency(str);
    }

    public static void findOccurrencesOfUSCurrency(String text){
        Pattern pattern = Pattern.compile("\\$\\d+.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
