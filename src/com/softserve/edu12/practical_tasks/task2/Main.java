package com.softserve.edu12.practical_tasks.task2;

public class Main {
    public static void main(String[] args) {

        Plant[] plants = {
                new Plant(15, Type.WEED, Color.PINK),
                new Plant(10, Type.COR, Color.BLUE),
                new Plant(50, Type.TREE, Color.GREEN),
                new Plant(4, Type.GRASS, Color.YELLOW),

               // new Plant(7, Type.FLOWER, Color.YELLOW),
               // new Plant(7, Type.WEED, Color.RED)
        };

        for (Plant p : plants) {
            System.out.println(p);
        }
    }
}
