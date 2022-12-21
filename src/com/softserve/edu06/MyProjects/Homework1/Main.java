package com.softserve.edu06.MyProjects.Homework1;

import java.util.ArrayList;

/* Roman Sitko. Lesson 6. Homework 1.
* */
public class Main {
    public static void main(String[] args) {
        Main.run();

    }

    public static void run() {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Penguin(false, false));
        birds.add(new Eagle(true, false));
        birds.add(new Swallow(true, false));
        birds.add(new Chicken(true, true));
        for(Bird bird : birds) {
            bird.fly();
        }
    }
}
