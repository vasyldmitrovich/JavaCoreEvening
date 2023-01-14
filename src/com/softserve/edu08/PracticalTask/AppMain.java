package com.softserve.edu08.PracticalTask;

public class AppMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department department = new Department("Nazar", new Department.Address("Lviv", "Trakt", 161));
        System.out.println("1." + department);

        Department departmentClone = (Department) department.clone();
        System.out.println("2." + departmentClone);

        department.setName("Nazariy");
        department.address().setCity("Ternopil");

        System.out.println("1." + department);

        System.out.println("2." + departmentClone);
    }
}
