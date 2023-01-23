package com.softserve.Tasks;

import com.softserve.Tasks.T12.NaturalNumbers;

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
                case 1: Task1.doTask1(); break;
                case 3: Task3.doTask3(); break;
                case 4: Task4.doTask4(); break;
                case 5: Task5.isPalindrome("abccba"); break;
                case 6: Task6.wordsCalculator("I learn Java"); break;
                case 9: Task9_11.doTask9(); break;
                case 10: Task9_11.doTask10(); break;
                case 12:
                    NaturalNumbers.doTask12(); break;
            }
        }
    }
}
