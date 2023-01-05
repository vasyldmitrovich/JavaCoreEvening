package com.softserve.edu07.practical_tasks;

public class Main {
    public static void main(String[] args) {
        animal();
    }

    public static void animal() {

        Animal[] animals = {new Cat(),
                new Dog()};
        for (Animal animal : animals) {
            animal.feed();
            animal.voice();

        }
    }
}
