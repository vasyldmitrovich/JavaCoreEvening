package com.softserve.edu07.sort.MyProjects.PracticalTask2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run() {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Andriy", "KH-12"));
        persons.add(new Teacher("Rick", 12000.00f));
        persons.add(new Cleaner("Bob",6000.00f));
        for(Person person : persons) {
            person.print();
            if(person instanceof Staff) {
                System.out.println("Salary: " + ((Staff) person).salary());
            }
        }

        //Other version without array
//        Person person = new Cleaner("Chuck", 6500.00f);
//        person.print();
//        Staff s = (Cleaner)person;
//        System.out.println("Salary: " + s.salary());

    }
}
