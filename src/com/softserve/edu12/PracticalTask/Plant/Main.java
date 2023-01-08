package com.softserve.edu12.PracticalTask.Plant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ColorException, TypeException {
        run();
    }

    public static void run() throws ColorException, TypeException {
        List <Plant>  plants = null;
        try {
            plants = declarePlantation();
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        }
        System.out.println(plants);
    }

    public static List<Plant> declarePlantation() throws ColorException, TypeException {
        List <Plant> plantList = new ArrayList<>();
        plantList.add(new Plant(1, "green", "rose"));
        plantList.add(new Plant(2, "blue", "tulip"));
        plantList.add(new Plant(3, "purple", "daisy"));
        plantList.add(new Plant(4, "pink", "iris"));
        plantList.add(new Plant(5, "white", "jasmine"));
        return plantList;
    }
}
