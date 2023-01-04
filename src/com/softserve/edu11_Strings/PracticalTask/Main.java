package com.softserve.edu11_Strings.PracticalTask;

import com.softserve.service.MyScanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
       checkSubstring();

       System.out.println();
       outputPersonalData();

       System.out.println();
       checkNames();
    }

    public static void checkSubstring(){
        String s1 = MyScanner.writeInputString("Enter first string");
        String s2 = MyScanner.writeInputString("Enter second string");

       String res = s2.contains(s1)?"First string is substring of second":"First string isn't substring of second";
       System.out.println(res);
    }

    public static void outputPersonalData(){
        String personalData = MyScanner.writeInputString("Enter surname, name and patronymic");

        String[] arrayData = personalData.split(" ");
        String surname = arrayData[0];
        String name = arrayData[1];
        String patronymic = arrayData[2];

        System.out.println("Surname and initials: "+getSurnameAndInitials(surname, name,patronymic));
        System.out.println("Name: "+name);
        System.out.println("Name, middle name and last name:"+getNamePatronymicSurname(surname, name,patronymic));
    }

    public static String getSurnameAndInitials(String surname, String name,String patronymic){
        StringBuffer res = new StringBuffer();
        res.append(surname);
        res.append(" ");
        res.append(name.toUpperCase().charAt(0));
        res.append(". ");
        res.append(patronymic.toUpperCase().charAt(0));
        res.append(".");

        return res.toString();
    }

    public static String getNamePatronymicSurname(String surname, String name,String patronymic){
        StringBuffer res = new StringBuffer();
        res.append(name);
        res.append(" ");
        res.append(patronymic);
        res.append(" ");
        res.append(surname);

        return res.toString();
    }

    public static void checkName(String name){
        String pattern = "^\\w{3,15}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);

        if (m.matches()){
            System.out.printf("Name %s is valid\n", name);
        }
        else{
            System.out.printf("Name %s isn't valid\n", name);
        }
    }

    public static void checkNames(){
        List<String> arrayNames = new ArrayList<>();

        for (int i = 0; i <5; i++) {
            arrayNames.add(MyScanner.writeInputString("Input name "+(i+1)));
        }

        Iterator<String> iterator = arrayNames.iterator();
        while (iterator.hasNext()){
            checkName(iterator.next());
        }
    }
}
