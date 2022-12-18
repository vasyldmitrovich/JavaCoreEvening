package com.softserve.edu07.homeTask.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Employee> employees = createEmployees();
        sortEmployees(employees);
        System.out.println("Average salary is: " + getAverageSalary(employees));
    }
    public static double getAverageSalary(List<Employee> employees){
        double salary = 0;

        for (Employee employee: employees){
            salary+=employee.calculatePaid();
        }
        return salary/employees.size();
    }

    public static void sortEmployees(List<Employee> employees){

        System.out.println("Before sorting: ");
        System.out.println(employees);

        //sort employees in descending order by salary
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -((int) (o1.calculatePaid() - o2.calculatePaid()));
            }
        });

        System.out.println("After sorting: ");
        System.out.println(employees);
    }

    public static List<Employee> createEmployees(){
        Employee employee1 = new SalariedEmployee("bc125", "Vladyslav" , 15500.00, "fx10D44s");
        Employee employee2 = new SalariedEmployee("ol451", "Oleh", 21500.00, "ab914A4b");

        Employee employee3 = new ContractEmployee("ma569", "Severyn", 50.5, 220,"fe12te543ki1");
        Employee employee4 = new ContractEmployee("vb167", "Nazar", 61.5, 190,"as46yu867lo0");
        return new ArrayList<>(List.of(employee1,employee2,employee3,employee4));
    }
}
