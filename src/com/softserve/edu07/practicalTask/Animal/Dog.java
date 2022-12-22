package com.softserve.edu07.practicalTask.Animal;

public class Dog implements Animal {
    String animal = "Dog";
    private String name;

    public Dog(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void voice(){
        System.out.println("Woff!");
    };
    public void feed(){
        System.out.println(name + ", are you hungry?");
    };
}
