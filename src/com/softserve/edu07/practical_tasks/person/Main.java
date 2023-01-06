package com.softserve.edu07.practical_tasks.person;

public class Main {
    public static void main(String[] args) {
        persons();
    }

    private static void persons() {
        Person[] persons = {new Teacher("Mr. Anderson",2750), new Teacher("Mrs. Rachel",3200),
                new Cleaner("Bob",1500), new Cleaner("Tom",1700),
                new Student("Alex"), new Student("Jack ")};

        for (Person person:persons) {
                person.print();
            if (person instanceof Teacher | person instanceof Cleaner){
                 ((Staff) person).salary();
            }

        }
    }

}
