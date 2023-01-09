package com.softserve.edu11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask1 {



    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
    }

    //Enter the two variables of type String. Determine whether the first variable substring second. For
    //example, if you typed «IT» and «IT Academy» you must receive true

        static void runFirstTask() {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            String subtext = scanner.nextLine();
            System.out.println("First variable substring second - that's " + text.contains(subtext));
        }


    /* Enter surname, name and patronymic on the console as a variable of type String. Output on the
    console:• surnames and initials • name • name, middle name and last name*/

        static void runSecondTask() {

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter surname");
        String surname = scanner2.nextLine();
        System.out.println("Enter name");
        String name = scanner2.nextLine();
        System.out.println("Enter patronymic");
        String patronymic = scanner2.nextLine();

        System.out.println(surname+ " " + name.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0)+".");
        System.out.printf("Name - %s \n", name);
        System.out.printf("Name - %s, Middle name - %s, Surname - %s \n", name, patronymic, surname);
        }

    /*The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
    Using regular expressions implement checking the user name for validity. Input five names in
    the main method . Output a message to the console of the validation of each of the entered
    names. */

        static void runThirdTask() {
            System.out.println("Enter your userName");
            Scanner scanner3 = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                String userName = scanner3.nextLine();
                Pattern pattern = Pattern.compile("[\\w_]{3,15}");
                Matcher matcher = pattern.matcher(userName);
                if (matcher.matches()) {
                    System.out.println("Valid userName");
                } else System.out.println("Not valid userName");
            }
        }
}
