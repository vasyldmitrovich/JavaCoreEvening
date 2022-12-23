package com.softserve.edu05.PracticalTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private String name;
    private int deptNumber;
    private int salary;
    static ArrayList<Employee> array = new ArrayList<>();
    private static boolean checkDepart = false;


    public Employee (String name, int deptNumber, int salary){
        this.name = name;
        this.deptNumber = deptNumber;
        this.salary = salary;
        array.add(this);
    }

//    public Employee (){
//        name = "";
//        deptNumber = 0;
//        salary = 0;
//    }



    public String getName() {
        return name;
    }
    public int getDeptNumber(){
        return deptNumber;
    };
    public int getSalary(){
        return salary;
    }

    public static void employeeOfDept() {
        System.out.println("ВВеведіть номер департаменту 13 або 56");
        Scanner scan = new Scanner(System.in);
        int deptNumber = scan.nextInt();
        for (Employee emp : array) {
            if (emp.getDeptNumber() == deptNumber) {
                System.out.println(emp);
                checkDepart = true;
            }
        }
        if (!checkDepart) System.out.println("Такого департаменту не існує");
    }


        public static void salerySort() {
            array.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o2.getSalary() - o1.getSalary();
                }
            });
            System.out.println("Зарплата за змншенням");
            System.out.println(array);
        }

    @Override
    public String toString() {
        return ("Працівник:" + name+
                "Номер департаменту" + getDeptNumber() +
                "Зарплатня" + getSalary());
    }
    

}
