package com.softserve.edu07.practicalTask.Person;

public class AppPerson {
    public static void main(String[] args) {
        Person [] arr = {
                new Student("Mark"),
                new Teacher("math teacher", "Oleh"),
                new Cleaner("office cleaner", "Taras"),
                new Student("Olha")
                };
        for (Person i: arr) {
            i.print();
            if(i instanceof Teacher || i instanceof Cleaner){
                ((Staff) i).salary();
            }
        }
    }
}
