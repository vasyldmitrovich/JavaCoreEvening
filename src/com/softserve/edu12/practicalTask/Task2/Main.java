package com.softserve.edu12.practicalTask.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Plant> plants = createPlantsList();
        System.out.println(plants);
    }

    public static List<Plant> createPlantsList(){
        List<Plant> tempList = new ArrayList<>();
        try {
            tempList.add(new Plant(10, "white", "chamomile"));
            tempList.add(new Plant(11, "red", "rose"));
            tempList.add(new Plant(10, "blue", "chrysanthemum"));
            tempList.add(new Plant(15, "yellow", "chrysanthemum")); // will throw ColorException
            tempList.add(new Plant(14, "red", "tulip")); //will throw Type exception,
        } catch (ColorException | TypeException e) {
            tempList.clear();
            e.printStackTrace();
        }
        return tempList;
    }
}
