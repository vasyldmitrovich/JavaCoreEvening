package com.softserve.edu07.practicalTask.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Person> personList = createPersons();
        showInfo(personList);
    }

    public static List<Person> createPersons(){

        Person person1 = new Student("Vlad");
        Person person2 = new Student("Orest");
        Person person3 = new Cleaner("Oleg");
        Person person4 = new Teacher("Sergiy");
        Person person5 = new Teacher("Yevhen");
        System.out.println("____________________________");

        return new ArrayList<>(List.of(person1,person2,person3,person4,person5));
    }

    public static void showInfo(List<Person> personList){
        for (Person person: personList){
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
