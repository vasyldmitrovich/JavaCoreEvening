package com.softserve.edu07.sort.practicalTask.Person;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import static com.softserve.edu06.practicalTasks.car.UserEnter.numFloat;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numb;

public class Teacher extends Staff{
    final String TYPE_PERSON;
    private String name;

    public Teacher(String type_person, String name){
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
        UserEnter.UserEnterNum("Введіть кількість днів, які відпрацював вчитель:");
        int days = numb;
        UserEnter.UserEnterNumFloat("Введіть денну ставку вчителя:");
        float rate = numFloat;
        float teacherSalary = (float) days * rate;
        System.out.println("Зарплата вчителя: " + teacherSalary);
        return teacherSalary;

    }
}
