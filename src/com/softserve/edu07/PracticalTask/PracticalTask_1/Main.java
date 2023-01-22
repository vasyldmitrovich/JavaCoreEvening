package com.softserve.edu07.PracticalTask.PracticalTask_1;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Dog(),
                new Cat(),
                new Cat()
        };

        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
