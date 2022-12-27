package com.softserve.edu08.MyProjects.PracticalTask1;


/*Roman Sitko. Lesson 8. Practical Task 1
* */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();

    }

    /*All good :-)*/
    public static void run() throws CloneNotSupportedException {
        Department department = new Department("Roman", "Lviv", "Doroshenka", 5);
        System.out.println("Original: " + department);

        try {
            Department department1 = (Department) department.clone();
            System.out.println("Copy: " + department1);
            department1.setName("Oksana");
            department1.getAddress().setBuilding(7);

            System.out.println("Copy after change: " + department1);
            System.out.println("Original after change: " + department);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
