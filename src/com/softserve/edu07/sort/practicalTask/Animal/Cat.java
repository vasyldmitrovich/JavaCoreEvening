package com.softserve.edu07.sort.practicalTask.Animal;

public class Cat implements Animal {
    final String ANIMAL = "Cat";
    private String name;

    public Cat(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void voice(){
        System.out.println("Meow!");
    };
    public void feed(){
       System.out.println(name + ", are you hungry?");
    };
}
