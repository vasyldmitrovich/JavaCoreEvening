package com.softserve.edu04.practicalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void dayOfTheWeek() {
        System.out.println("Input number of the week");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Days> daysArr = new ArrayList<>(Arrays.asList(Days.values()));

        if (num > 7) {
            System.out.println("Bad number");
            System.exit(1);
        }
        System.out.println(daysArr.get(num - 1).getDay());
    }

    /*Do not do enum like inner class, create for enum own file, enum must be like unique class
    * Can do inner only if that inner class do not have purport outside*/

}
