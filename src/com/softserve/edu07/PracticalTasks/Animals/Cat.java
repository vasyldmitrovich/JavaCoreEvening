package com.softserve.edu07.PracticalTasks.Animals;

import com.softserve.edu07.PracticalTasks.Animals.Animal;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("The cat is fed");
    }
}
