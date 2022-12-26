package com.softserve.edu05.MyProjects.HomeworkTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcMounth {

    private String output;
    private final int[] arrayOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CalcMounth () {}

    public String getOutput() {
        return output;
    }

    public int inputData () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of month from 1 to 12: ");
        return Integer.parseInt(br.readLine());
    }

    public String calcNumMounth (int numMouth) {
        switch (numMouth) {
            case 1:
                output = "There are " + arrayOfDays[0] + " days.";
                break;
            case 2:
                output = "There are " + arrayOfDays[1] + " days.";
                break;
            case 3:
                output = "There are " + arrayOfDays[2] + " days.";
                break;
            case 4:
                output = "There are " + arrayOfDays[3] + " days.";
                break;
            case 5:
                output = "There are " + arrayOfDays[4] + " days.";
                break;
            case 6:
                output = "There are " + arrayOfDays[5] + " days.";
                break;
            case 7:
                output = "There are " + arrayOfDays[6] + " days.";
                break;
            case 8:
                output = "There are " + arrayOfDays[7] + " days.";
                break;
            case 9:
                output = "There are " + arrayOfDays[8] + " days.";
                break;
            case 10:
                output = "There are " + arrayOfDays[9] + " days.";
                break;
            case 11:
                output = "There are " + arrayOfDays[10] + " days.";
                break;
            case 12:
                output = "There are " + arrayOfDays[11] + " days.";
                break;
            default:
                output = "Number of month is wrong";
                break;
        }
        return output;
    }

}
