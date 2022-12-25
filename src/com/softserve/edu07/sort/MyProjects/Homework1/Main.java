package com.softserve.edu07.sort.MyProjects.Homework1;

import com.softserve.edu07.sort.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("1", "Diego", 5, 200, "M-0123KC"));
        employees.add(new ContractEmployee("2", "Eglesias", 10, 610, "M-5345JY"));
        employees.add(new ContractEmployee("3", "Enrique", 6, 205, "M-3241JU"));
        employees.add(new SalariedEmployee("4", "Ronaldo",5200.6f, "4321213"));
        employees.add(new SalariedEmployee("5", "Huan",5100.6f, "5879034"));

        System.out.println("Original array:" + employees);

        //Arrays.sort(employees, new Employee.BySal());

        Collections.sort(employees, new Employee.BySal());
        System.out.println("Sort array:" + employees);
    }
}
