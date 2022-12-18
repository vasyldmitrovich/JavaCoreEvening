package com.softserve.edu06.practicalTasks.car;

import java.util.Scanner;

public class UserEnter {
    public static String inform;
    public static String UserEnter(String quest){
    Scanner inp = new Scanner(System.in);
    System.out.println(quest);
    inform = inp.nextLine();
    return inform;
    }
}
