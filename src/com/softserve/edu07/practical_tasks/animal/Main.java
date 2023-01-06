package com.softserve.edu07.practical_tasks.animal;


public class Main {
    public static void main(String[] args) {
        animal();
    }

    public static void animal() {
        Animal[] animals = {new Cat("Tom"), new Dog("Spike")};

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();

        }
    }
}
