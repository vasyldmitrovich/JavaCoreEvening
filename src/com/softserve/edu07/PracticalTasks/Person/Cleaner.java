package com.softserve.edu07.PracticalTasks.Person;

public class Cleaner extends Staff{

    final public static String TYPE_PERSON = "Mike";

    public Cleaner(String typePerson) {
        super();
    }


    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's salary 6000");
    }
}
