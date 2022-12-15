package com.softserve.edu05.MyProjects.HomeworkTask1;

/*Roman Sitko. Lesson 5. Homework 1.
* Ask user to enter the number of month.
* Read the value and write the number of days in this month (create array with amount days of each month)
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arrayOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of month from 1 to 12: ");
        int numMouth = Integer.parseInt(br.readLine());

        switch (numMouth){
            case 1:
                System.out.println("There are " + arrayOfDays[0] + " days.");
                break;
            case 2:
                System.out.println("There are " + arrayOfDays[1] + " days.");
                break;
            case 3:
                System.out.println("There are " + arrayOfDays[2] + " days.");
                break;
            case 4:
                System.out.println("There are " + arrayOfDays[3] + " days.");
                break;
            case 5:
                System.out.println("There are " + arrayOfDays[4] + " days.");
                break;
            case 6:
                System.out.println("There are " + arrayOfDays[5] + " days.");
                break;
            case 7:
                System.out.println("There are " + arrayOfDays[6] + " days.");
                break;
            case 8:
                System.out.println("There are " + arrayOfDays[7] + " days.");
                break;
            case 9:
                System.out.println("There are " + arrayOfDays[8] + " days.");
                break;
            case 10:
                System.out.println("There are " + arrayOfDays[9] + " days.");
                break;
            case 11:
                System.out.println("There are " + arrayOfDays[10] + " days.");
                break;
            case 12:
                System.out.println("There are " + arrayOfDays[11] + " days.");
                break;
            default:
                System.out.println("Number of month is wrong");
                break;
        }
    }
}
