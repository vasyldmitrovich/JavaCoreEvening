package com.softserve.edu07.PracticalTasks.Person;

public class Teacher extends Staff{
    final public static String TYPE_PERSON = "Rose";

    public Teacher(String typePerson) {
        super();
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("Teacher's salary 10000");
    }
}
