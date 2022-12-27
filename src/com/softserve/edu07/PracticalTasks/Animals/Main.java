package com.softserve.edu07.PracticalTasks.Animals;

public class Main {
    public static void main(String[] args) {
        run();
    }


    public static void run(){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal[] animals = {cat1, cat2, dog1, dog2};

        /*After all that next lines use cycle*/
        cat1.voice();
        cat1.feed();
        cat2.voice();
        cat2.feed();
        dog1.voice();
        dog1.feed();
        dog2.voice();
        dog2.feed();

    }

}
