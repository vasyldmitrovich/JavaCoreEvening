package com.softserve.edu08.practicalTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }

    public static void run() throws CloneNotSupportedException {
        Department department1 = new Department("finance department" ,"Lviv", "Shevchenka street", 60);

        Department department2 = (Department) department1.clone();
        department2.setName("IT department");
        department2.setAddress("Kyiv", "Zelena street", 17);
        System.out.println(department1);
        System.out.println(department2);
    }
}
