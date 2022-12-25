package com.softserve.edu08.practicalTask;

public class AppDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department.Address depAdd = new Department("Oleg Ivanov").new Address("Lviv", "Shevchenka", 56);

        Department.Address depAdd2 = (Department.Address) depAdd.clone();
        depAdd.Info();
        depAdd2.Info();
        System.out.println("_________________________");

        depAdd2.setCity("Rivne");
        depAdd.Info();
        depAdd2.Info();
    }
}
