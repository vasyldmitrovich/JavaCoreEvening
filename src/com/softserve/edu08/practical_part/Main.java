package com.softserve.edu08.practical_part;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();

    }

    public static void run() throws CloneNotSupportedException {

        Department department = new Department("IT", new Department.Address("Dnipro","Barykadna Street",16));
        System.out.println(department);

        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.address = (Department.Address) copyOfDepartment.address.clone();
        copyOfDepartment.address.setCity("Lviv");

        System.out.println(copyOfDepartment);
        System.out.println(department);
    }
}
