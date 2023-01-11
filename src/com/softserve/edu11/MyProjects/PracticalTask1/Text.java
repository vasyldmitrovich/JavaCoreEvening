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
    public static void check() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input some text: ");
        String str = br.readLine();

        System.out.print("Input part of text: ");
        String str1 = br.readLine();

        System.out.println(str.contains(str1));
    }
}
