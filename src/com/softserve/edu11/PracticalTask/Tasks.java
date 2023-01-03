package com.softserve.edu11.PracticalTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void task1() {
        System.out.println("Введіть першу змінну: ");
        String s1 = StringInput();
        System.out.println("Введіть другу змінну: ");
        String s2 = StringInput();

        System.out.println("Чи містить друга змінна елементи першої змінної? " + s1.contains(s2));
    }

    public static String StringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }


    public static void task2() {
        System.out.println("Введіть Прізвище, Ім*я та По-батькові:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");


        if (splitInput.length != 3) {
            System.out.println("Введіть коректні дані!");
            return;
        }

        System.out.println("Прізвище та ініціали: " + initials(splitInput));
        System.out.println("Ім*я: " + splitInput[1]);
        System.out.println("Ім*я, По-батькові, Прізвище: " + splitInput[1] + " " + splitInput[2] + " " + splitInput[0]);

    }

    public static String initials(String[] userName) {
        String surnameInitials = "";
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                surnameInitials += userName[i].substring(0, 1).toUpperCase() + ".";
            } else {
                surnameInitials += userName[i];
                surnameInitials += " ";
            }

        }
        return surnameInitials;
    }

    public static void task3(String[] userNames) {
        for (String userName : userNames) {
            Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
            Matcher m = p.matcher(userName);

            System.out.println(userName + " Чи відповідає умові: " + (m.matches()));


        }
    }
}



