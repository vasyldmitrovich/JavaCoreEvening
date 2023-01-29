package com.softserve.edu08;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();

    }

    /*All good :-)*/
    public static void run() {
        Department department = new Department("Mateo", "Napoli", "Aniello Palumbo", 65);
        System.out.println("Original: " + department);

        try {
            Department department1;
            department1 = (Department) department.clone();
            System.out.println("Copy: " + department1);
            department1.setName("Dana");
            department1.getAddress().setBuilding(7);

            System.out.println("Copy after change: " + department1);
            System.out.println("Original after change: " + department);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}