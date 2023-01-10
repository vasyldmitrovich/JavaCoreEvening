package com.softserve.edu12.practicalTask.Plants;

public class AppPlant {
    public static void main(String[] args) throws  ColorException, TypeException {

            Plant [] plantArr = new Plant[5];
            plantArr[0] = new Plant(1, "red", "herb");
            plantArr[1] = new Plant(2, "blue", "shrub");
            plantArr[2] = new Plant(3, "yellow", "rabbit");
            plantArr[3] = new Plant(4, "green", "climber");
            plantArr[4] = new Plant(5, "green", "tree");

        for (Plant el: plantArr) {
            System.out.println(el.toString());
        }


    }
}
