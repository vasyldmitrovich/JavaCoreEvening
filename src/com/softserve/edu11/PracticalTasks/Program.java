package com.softserve.edu11.PracticalTasks;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        firstPracticalTask();
        secondPracticalTask();
        thirdPracticalTask();

    }

    public static void firstPracticalTask(){
        System.out.println("Input first string: ");
        String string1 = input();
        System.out.println("Input second string: ");
        String string2 = input();
        System.out.println(isSubstring(string1, string2) ? "Yes, substring" : "No");
    }

    public static boolean isSubstring(String str1, String str2){
        return str2.contains(str1);
    }

    public static void secondPracticalTask(){
        System.out.println("Enter surname");
        String surname = input();
        System.out.println("Enter name");
        String name = input();
        System.out.println("Enter patronymic");
        String patronymic = input();
        System.out.println("surnames and initials: " + surname + " " + name.substring(0, 1) + "." + patronymic.substring(0,1) + ".");
        System.out.println("name: " + name);
        System.out.println("name, middle name and last name: " +  name + " " + patronymic + " " + surname);
    }

     public static void thirdPracticalTask(){
        String[] userNameString = new String[5];
        for (int i = 0; i <5 ; i++) {
             userNameString[i] = input();
         }
         for (String userName: userNameString) {
             System.out.println(userName + "  checking the user name for validity  " + checkWithRegExp(userName));
         }
     }

    public static boolean checkWithRegExp(String userName){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }


    public static String input(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
}


