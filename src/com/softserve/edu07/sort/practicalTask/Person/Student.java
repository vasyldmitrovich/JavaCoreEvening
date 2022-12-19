package com.softserve.edu07.sort.practicalTask.Person;

public class Student extends Person{
    final String TYPE_PERSON = "student";
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Hi! My name is " + name + ", I am a " + TYPE_PERSON);
    }

}
