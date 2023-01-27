package com.softserve.edu01.cv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = br.readLine();

        System.out.println("Where do you live, " + name + "?");
        String adress = br.readLine();


        System.out.print("Your name is "+name+","+"and you live in " + adress);



    }
}


