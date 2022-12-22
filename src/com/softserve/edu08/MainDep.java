package com.softserve.edu08;

public class MainDep {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department d1 = new Department("Managers", new Department.Address("Kharkiv", "Nauky", 125));
        Department cloneD1 = (Department) d1.clone();
        System.out.println(d1);
        System.out.println(cloneD1);
        cloneD1.getAddress().setCity("Odessa");
        System.out.println(d1);
        System.out.println(cloneD1);

    }
}
