package com.softserve.edu07.sort.MyProjects.PracticalTask1;

import java.util.ArrayList;
/* Roman Sitko
* Project about Animals
* */

public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        for(Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
