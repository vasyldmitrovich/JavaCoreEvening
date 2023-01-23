package com.softserve.Tasks;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        go();

    }

    public static void go(){

        boolean run = true;

        while (run){
            System.out.println("Input number task");

            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.next());

            switch (n){
                case 0: run = false; break;
                case 9: Task9_11.doTask9(); break;
            }
        }
    }
}
