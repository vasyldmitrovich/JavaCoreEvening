package com.softserve.edu06.practicalTasks.car;

import java.util.Scanner;

public class UserEnter {
    public static String inform;
    public static int numb;

    public static float numFloat;
    public static String UserEnter(String quest){
        Scanner inp = new Scanner(System.in);
        System.out.println(quest);
        inform = inp.nextLine();
        return inform;
    }

    public static int UserEnterNum(String quest){
        Scanner inp = new Scanner(System.in);
        System.out.println(quest);
        numb = inp.nextInt();
        return numb;
    }

    public static float UserEnterNumFloat(String quest){
        Scanner inp = new Scanner(System.in);
        System.out.println(quest);
        numFloat = inp.nextFloat();
        return numFloat;
    }
}
