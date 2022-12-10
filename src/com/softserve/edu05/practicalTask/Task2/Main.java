package com.softserve.edu05.practicalTask.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Vladyslav", DepartmentNumber.DEPARTMENT_101, 15000.00);
        Employee employee2 = new Employee("Andriy", DepartmentNumber.DEPARTMENT_103, 17400.00);
        Employee employee3 = new Employee("Ivan", DepartmentNumber.DEPARTMENT_105, 21500.00);
        Employee employee4 = new Employee("Oleg", DepartmentNumber.DEPARTMENT_102, 12800.00);
        Employee employee5 = new Employee("Stanislav", DepartmentNumber.DEPARTMENT_105, 25000.00);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        System.out.println("Enter department number (101 - 105): ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //find employee by departmentNumber
        for(Employee employee: employees){
            if(employee.getDepartmentNumber() == number){
                System.out.println(employee);
            }
        }

        //sort employees by salary
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(employees));

        Employee temp;
        for(int i = 0; i < employees.length; i++){
            for(int j = 0; j < employees.length-1; j++){
                if(employees[j].getSalary() < employees[j+1].getSalary()){
                    temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(employees));

    }
}
