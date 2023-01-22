package com.softserve.edu11.practical_tasks;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        firstTask();
        secondTask();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter user name: ");
            thirdTask(scanner.nextLine());
        }
    }

    private static void thirdTask(String name) {
        Pattern p = Pattern.compile("^\\w{3,15}$");
        Matcher m = p.matcher(name);
        System.out.println(m.matches() ? "Name [" + name + "] is valid" : "Name [" + name + "] is not valid");

    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter surname: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter surname: ");
        String patronymic = scanner.nextLine();

        System.out.println(surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase() + " " + name.toUpperCase().charAt(0) + ". " + patronymic.toUpperCase().charAt(0) + ".");
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.println(surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase() + " "
                + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " "
                + patronymic.substring(0, 1).toUpperCase() + patronymic.substring(1).toLowerCase());
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println(str1.contains(str2) ? "Yes" : "No");
    }
}
