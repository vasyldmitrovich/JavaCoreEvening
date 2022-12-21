package com.softserve.edu08.practicalTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        runDepartment();
    }

    static void runDepartment() throws CloneNotSupportedException {
        Department department = new Department("Asd", new Department.Address("Kyiv", "Kharkivske highway", 51));
        System.out.println(department);
        Department department1 = (Department) department.clone();
        System.out.println(department1);
        department.getAddress().setCity("Lviv");
        System.out.println(department);
        System.out.println(department1);

    }
}
