package com.softserve.edu11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    private String text1, text2;


    public static void printCheckText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some text: ");
        String str = br.readLine();

        System.out.print("Enter part of text: ");
        String str1 = br.readLine();

        System.out.println(str.contains(str1));
    }

    public static void printName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter lastname: ");
        String lastname  = br.readLine().trim();

        System.out.print("Enter name: ");
        String name = br.readLine().trim();

        System.out.print("Enter middle name: ");
        String middleName = br.readLine().trim();

        char[] nameChar = name.toCharArray();
        char[] nameMNameChar = middleName.toCharArray();
        System.out.println(lastname + " " + nameChar[0] +
                ". " + nameMNameChar[0] + ".");
        System.out.println(name);
        System.out.println(name + " " + middleName + " " +
                lastname);
    }


    public static void printName1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter surname, name and patronymic (like Shkimba Yurii Yaroslovovych): ");
        String text  = br.readLine().trim();

        int index = text.indexOf(" ");

        for(int i = 0; i < text.length(); i++) {
            if(i < index) {
                System.out.print(text.charAt(i));
            }
            if (Character.isSpaceChar(text.charAt(i)) && Character.isLetter(text.charAt(i + 1))) {
                System.out.print(" " + text.charAt(i + 1) + ".");
            }
        }

        System.out.println();
        int j = 0;
        for(int i = 0; i < text.length() - 2; i++) {
            if (Character.isSpaceChar(text.charAt(i)) && Character.isLetter(text.charAt(i + 1))) {
                j = i + 1;
                while (Character.isLetter(text.charAt(j))) {
                    System.out.print(text.charAt(j));
                    j++;
                }
                break;
            }
        }
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-zA-Z\\s0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }


}

