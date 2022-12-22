package com.softserve.edu07.practicalTask.Person;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import static com.softserve.edu06.practicalTasks.car.UserEnter.numFloat;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numb;

public class Cleaner extends Staff{
    final String TYPE_PERSON;
    private String name;

    public Cleaner(String type_person, String name){
        TYPE_PERSON = type_person;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Hi! My name is " + name + " and I am a " + TYPE_PERSON);
    }

    @Override
    public float salary(){
        UserEnter.UserEnterNum("Введіть кількість годин, які відпрацював працівник:");
        int hours = numb;
        UserEnter.UserEnterNumFloat("Введіть годинну плату:");
        float rate = numFloat;
        float cleanerSalary = (float) hours * rate;
        System.out.println("Зарплата працівника: " + cleanerSalary);
        return cleanerSalary;

    }
}

