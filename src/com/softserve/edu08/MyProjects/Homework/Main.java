package com.softserve.edu08.MyProjects.Homework;


/*Roman Sitko
* Lesson 8 Homework
* */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }

    public static void run() throws CloneNotSupportedException {
        Person person1 = new Student(new FullName("Rick", "Stuard"), 11, 20);
        Person person2 = new Student(new FullName("Ivan", "Petrenko"), 12, 21);
        print(person1);
        print(person2);

        System.out.println("Clone person to person2 and setAge(35)");
        Person person3 = (Person) person2.clone();
        person2.setAge(35);

        print(person2);
        print(person3);
    }

    public static void print(Person person) {
        System.out.print(person.info());
        System.out.println(". " + person.activity());
    }
}
