package com.softserve.edu04.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    static int oddsCounter;

    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException{

        int n1,n2,n3;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers: ");
        System.out.print("n1: ");
        n1 = Integer.parseInt(bf.readLine());
        System.out.print("n2: ");
        n2 = Integer.parseInt(bf.readLine());
        System.out.print("n3: ");
        n3 = Integer.parseInt(bf.readLine());
        countOdds(n1,n2,n3);
        System.out.println("Odds count: " + oddsCounter);

    }

    public static void countOdds(int n1, int n2, int n3){

        if(n1 % 2 == 0){
            oddsCounter++;
        }
        if(n2 % 2 == 0){
            oddsCounter++;
        }
        if(n3 % 2 == 0){
            oddsCounter++;
        }
    }
}
