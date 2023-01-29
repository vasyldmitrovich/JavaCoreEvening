package com.softserve.edu07;


import java.util.ArrayList;

public class Zoo
{
    public static void main(String[] args)
    {
        // create an ArrayList of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bars"));
        animals.add(new Cat("LOL"));
        animals.add(new Dog("Mazhor"));
        animals.add(new Cat("Wendsday"));


        for (Animal animal: animals)
        {
            System.out.println(animal.name()+ " : " + animal.makeNoise());
        }
    }
}