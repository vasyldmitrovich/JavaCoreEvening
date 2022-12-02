package com.softserve.edu01;
import java.util.Scanner;

public class AdditionalTask1 {


    public static void main(String[] args) {

        byte h;
        byte m;
        byte s;
        int ms;

        System.out.println("What hours are now?");
        Scanner sc = new Scanner(System.in);
        h = sc.nextByte();

        System.out.println("What minutes are now?");
        m = sc.nextByte();

        System.out.println("What seconds are now?");
        s = sc.nextByte();

        ms = (s+m*60+h*3600)*1000;
        System.out.printf("Now past %d milliseconds",ms);
    }

}
