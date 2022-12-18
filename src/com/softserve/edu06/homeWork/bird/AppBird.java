package com.softserve.edu06.homeWork.bird;

public class AppBird {
    public static void main(String[] args) {
        Birds [] birds = new Birds[4];
        birds[0] = new Eagle();
        birds[1] = new Chicken();
        birds[2] = new Swallow();
        birds[3] = new Penguin();


        for (Birds i : birds) {
                i.toString();
                i.fly();
                System.out.println("___________________________________");
            }

    }
}
