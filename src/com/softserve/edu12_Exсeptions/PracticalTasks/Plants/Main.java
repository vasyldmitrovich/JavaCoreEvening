package com.softserve.edu12_Exсeptions.PracticalTasks.Plants;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        List <Plant> arrayPlants = new ArrayList<>();

        try {
            arrayPlants.add(new Plant(10, "red", "rose"));
            arrayPlants.add(new Plant(5, "red", "tulip"));
            //arrayPlants.add(new Plant(12, "black", "tulip"));
            arrayPlants.add(new Plant(12, "blue", "tulip"));
           // arrayPlants.add(new Plant(8, "yellow", "sunflower"));
            arrayPlants.add(new Plant(8, "yellow", "tulip"));
            arrayPlants.add(new Plant(10, "white", "rose"));

            System.out.println(arrayPlants);
        }
        catch (ColorException|TypeException e) {
            System.out.println(e.getMessage());
        }

    }
}
