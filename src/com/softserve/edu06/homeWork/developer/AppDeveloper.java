package com.softserve.edu06.homeWork.developer;

public class AppDeveloper {
    public static void main(String[] args) {
        Employee employee = new Employee("Bohdan Ivchenko", 32, 15000);
        Developer developer = new Developer("Anna Tkachuk", 29, 20000, "front end developer");

       System.out.println(employee.report());
       System.out.println(developer.report());

    }
}
