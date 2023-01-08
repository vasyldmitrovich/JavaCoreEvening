package com.softserve.edu07.PracticalTask_2;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Teacher("Oleg", 1234),
                new Teacher("Ivan", 1234),
                new Cleaner("Dima", 1234),
                new Cleaner("Sasha", 1234),
                new Student("Olia"),
                new Student("Inna")
        };
        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
