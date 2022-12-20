package com.softserve.edu07.PracticalTasks.Animals;

import com.softserve.edu07.PracticalTasks.Animals.Animal;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("The dog is fed");
    }
}
