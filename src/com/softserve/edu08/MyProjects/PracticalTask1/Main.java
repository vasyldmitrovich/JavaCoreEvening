package com.softserve.edu08.MyProjects.PracticalTask1;


/*Roman Sitko. Lesson 8. Practical Task 1
* */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();

    }

    public static void run() throws CloneNotSupportedException {
        Department department = new Department("Roman", "Lviv", "Doroshenka", 5);
        System.out.println(department);

        Department department1 = (Department) department.clone();
        System.out.println(department1);
        department1.setName("Oksana");

        System.out.println(department);
    }
}
