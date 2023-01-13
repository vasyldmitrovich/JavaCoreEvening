package com.softserve.edu11.MyProjects.PracticalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private String text1, text2;

    /*Enter the two variables of type String.
    Determine whether the first variable substring second.
    For example, if you typed «IT» and «IT Academy» you must receive true.
     */
    public static void printCheckText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input some text: ");
        String str = br.readLine();

        System.out.print("Input part of text: ");
        String str1 = br.readLine();

        System.out.println(str.contains(str1));
    }
/*Enter surname, name and patronymic on the console as a variable of type String.
Output on the console:
surnames and initials
name
name, middle name and last name
//
Different String variable
*/
    public static void printName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input lastname: ");
        String lastname  = br.readLine().trim();

        System.out.print("Input name: ");
        String name = br.readLine().trim();

        System.out.print("Input middle name: ");
        String middleName = br.readLine().trim();

        char[] nameChar = name.toCharArray();
        char[] nameMNameChar = middleName.toCharArray();
        System.out.println(lastname + " " + nameChar[0] +
                ". " + nameMNameChar[0] + ".");
        System.out.println(name);
        System.out.println(name + " " + middleName + " " +
                lastname);
    }

    /*Enter surname, name and patronymic on the console as a variable of type String.
    Output on the console:
    surnames and initials
    name
    name, middle name and last name.
    //
    Alone String variable
    */
    public static void printName1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input surname, name and patronymic (like Petrenko Petro Petrovych): ");
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
