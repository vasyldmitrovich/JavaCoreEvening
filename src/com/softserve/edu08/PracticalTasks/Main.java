package com.softserve.edu08.PracticalTasks;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }


    public static void run() throws CloneNotSupportedException {
        Department.Address department  = new Department("technical department"). new Address( "Lviv", "Sadovaya street", 2);
        Department.Address copyOfDepartment = (Department.Address) department.clone();
        copyOfDepartment.setCity("Kharkiv");
        System.out.println(department);
        System.out.println(copyOfDepartment);
    }
}
