package com.softserve.edu01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Hello. What is your name?");
            String name = br.readLine();
            System.out.print("Where are you live," + name);
            System.out.println("?");
            String adress = br.readLine();

           System.out.println("Ім*я: " + name);
           System.out.println("Місце проживання: " + adress);
           // System.out.println("You are " + age);
        }
    }

