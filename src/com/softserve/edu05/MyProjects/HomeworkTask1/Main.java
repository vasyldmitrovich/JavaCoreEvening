package com.softserve.edu05.MyProjects.HomeworkTask1;

/*Roman Sitko. Lesson 5. Homework 1.
* Ask user to enter the number of month.
* Read the value and write the number of days in this month (create array with amount days of each month)
* */
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {
        int numMouth;
        CalcMounth calcMouth = new CalcMounth();
        numMouth = calcMouth.inputData();

        calcMouth.calcNumMounth(numMouth);
        System.out.println(calcMouth.getOutput());
    }
}
