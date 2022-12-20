package com.softserve.edu07.PracticalTasks.Person;

public class Main {
    public static void main(String[] args) {
        run();
    }


    public static void run(){
        Person teacher = new Teacher(Teacher.TYPE_PERSON);
        Person cleaner = new Cleaner(Cleaner.TYPE_PERSON);
        Person student = new Student(Student.TYPE_PERSON);
        Person[] person = {student, teacher, cleaner};
        for (Person persons: person){
            persons.print();
            if (persons instanceof Staff){
                ((Staff) persons).salary();
            }
        }

    }
}
