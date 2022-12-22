package com.softserve.edu08.PracticalTasks;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        createDepartment();
    }

    public static void createDepartment(){
        Department department = new Department("Department of Justice", "Dnipro", "Fabra", 25 );

        try{Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.setCity("Odessa");

        System.out.println(department);
        System.out.println(copyOfDepartment);
    } catch (CloneNotSupportedException exception){
        exception.printStackTrace();}
    }
}
