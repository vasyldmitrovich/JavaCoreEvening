package com.softserve.edu5.practicalTask.Employee;

import java.util.Scanner;

public class EmployeeArr {
   private String name;
   private int departmentNumber;
   private float salary;
    public EmployeeArr(){
        name = " ";
        departmentNumber = 0;
        salary = 0f;
    }
    public EmployeeArr(String name, int departmentNumber, float salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public int getDepartmentNumber(int departmentNumber){
        return departmentNumber;
    }
    public void setDepartmentNumber(int departmentNumber){
       this.departmentNumber = departmentNumber;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void departmentInfo() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введіть номер підрозділу: ");
        int depNumUs = inp.nextInt();
        if (depNumUs == this.departmentNumber) {
            System.out.println(this.name + this.departmentNumber);
        }
    }
}
