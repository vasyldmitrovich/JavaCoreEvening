package com.softserve.edu11.PratcicalTask;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {

    // task 1
    public boolean ifIsASubstring(String s1, String s2) {
        return s2.contains(s1);
    }

    //task 2
    public String inPut() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //task 2 continue
    public void outPut() {
        System.out.println("Task 2.\nEnter surname, name and patronymic (Surname Name MiddleName).");
        String s = inPut();
        Pattern p = Pattern.compile("[A-Za-z\\s]+");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            String[] outPut = s.split(" ");
            if (outPut.length != 3) {
                System.out.println("Result 2 task:\nFull name is not complete. Try again.");
                outPut();
            } else {
                System.out.println("Result 2 task:\n" + outPut[0] + ' ' + outPut[1].charAt(0) + '.' + outPut[2].charAt(0) + ".\n"
                        + outPut[1] + "\n"
                        + outPut[1] + ", " + outPut[2] + ' ' + outPut[0]);
            }
        } else {
            System.out.println("Result 2 task:\nInvalid input.\nTry again.");
            outPut();
        }

    }

    //task 3
    public void nameChecking() {
        List<String> names = new ArrayList<>();
        Pattern p = Pattern.compile("[A-Za-z0-9_]{3,15}");
        System.out.println("Task 3.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " name.");
            names.add(inPut());
        }
        System.out.println("\nResult 3 task:");
        for (String s : names) {
            Matcher m = p.matcher(s);
            if (m.matches()){
                System.out.println(s + " - [ Passed ]");
            } else {
                System.out.println(s + " - [ Failed ]");
            }
        }
    }
}
