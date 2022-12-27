package com.softserve.edu07.practicalTask.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*Respect, this realisation how use method in another methods is perfect, and code is nice to reed*/
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Animal> animals = createAnimals();
        for (Animal animal: animals){
            animal.feed();
            animal.voice();
        }
    }

    public static List<Animal> createAnimals(){
        Animal dog1 = new Dog("Rudy");
        Animal dog2 = new Dog("Walter");
        Animal dog3 = new Dog("Muhtar");
        Animal cat1 = new Cat("Luna");
        Animal cat2 = new Cat("Kittie");
        Animal cat3 = new Cat("Simba");
        return new ArrayList<>(List.of(dog1,dog2,dog3,cat1,cat2,cat3));
    }
}
