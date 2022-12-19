package com.softserve.edu07.sort.practicalTask.Animal;

public class AppAnimal {
    public static void main(String[] args) {
        Animal [] arr = {
                new Cat("Lora"),
                new Dog("Tom"),
                new Cat ("Sara"),
                new Dog("Ralf")
        };
        for (Animal i: arr) {
            i.feed();
            i.voice();
        }

    }
}
