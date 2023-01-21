package com.softserve.edu12.MyProjects.PracticalTask2;

import java.util.ArrayList;
import java.util.List;
/* Roman Sitko
* Lesson 12. Practical task 2
* */
public class Main {
    public static void main(String[] args) {
        List<Plant> list = new ArrayList<>();
        try {
            list.add(new Plant(10, "BLuE", "Herbs"));
            list.add(new Plant(11, "red", "CLIMBERS"));
            list.add(new Plant(20, "white", "herbs"));
            list.add(new Plant(0, "red", "ClimbeRS"));
            list.add(new Plant(12, "RED", "trees"));
            System.out.println(list);
        } catch (ColorException | TypeException | SizeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }


    }
}
