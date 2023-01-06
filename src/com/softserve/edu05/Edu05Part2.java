package com.softserve.edu05;

import java.util.Scanner;

/**
 * PRACTICAL TASK
 * Create a class Employee with fields name, department number, salary. Create five objects
 * of class Employee. Display
 * • all employees of a certain department (enter department number in the console);
 * • arrange workers by the field salary in descending order.
 */
public class Edu05Part2 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Tom", 301, 1500);
        employees[1] = new Employee("Max", 302, 2700);
        employees[2] = new Employee("Alex", 302, 2500);
        employees[3] = new Employee("Mason", 307, 2350);
        employees[4] = new Employee("NeMichael", 304, 3400);

        /*For input data from user create unique method and use there that method*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of department (3 symbol): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter right number");
            scanner.next();
        }
        int numberOfDepartment = scanner.nextInt();

        for (Employee employee : employees) {

            if (employee.departmentNumber == numberOfDepartment) {
                System.out.println(employee);
            }
        }

        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].salary < employees[j + 1].salary) {
                    temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        System.out.println(employees);

    }
}

class Employee {
    String name;
    int departmentNumber;
    int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { name = " + name + ", departmentNumber = " + departmentNumber + ", salary = " + salary + " }";
    }
//    public int getDepartmentNumber(){
//        return this.departmentNumber;
//    }
}
