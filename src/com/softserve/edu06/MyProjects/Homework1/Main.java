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
        birds.add(new Eagle());
        birds.add(new Swallow());
        birds.add(new Chicken());
        for(Bird bird : birds) {
            bird.fly();
        }
    }
}
