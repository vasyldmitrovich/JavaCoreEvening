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
}
