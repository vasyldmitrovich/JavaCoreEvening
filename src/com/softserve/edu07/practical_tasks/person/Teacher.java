package com.softserve.edu07.practical_tasks.person;

public class Teacher extends Staff {
    final String TYPE_PERSON;
    int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.TYPE_PERSON = this.getClass().getSimpleName();
    }

    @Override
    void print() {
        System.out.println("My name is " + this.name + ", and I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println(this.TYPE_PERSON + " " + this.name + " have salary " + this.salary);
    }
}
