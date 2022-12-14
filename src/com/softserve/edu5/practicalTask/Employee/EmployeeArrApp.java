package com.softserve.edu5.practicalTask.Employee;

public class EmployeeArrApp {
    public static void creatEmpl(){
        EmployeeArr empl1 = new EmployeeArr("Svilana Ivanova", 10, 10000f);
        EmployeeArr empl2 = new EmployeeArr("Alina Korovaj", 15, 11000f);
        EmployeeArr empl3 = new EmployeeArr("Petro Savchyk", 8, 9000f);
        EmployeeArr empl4 = new EmployeeArr("Leonid Tamin", 10, 10000f);
        EmployeeArr empl5 = new EmployeeArr();
        empl5.setName("Liliya Klevchyk");
        empl5.setSalary(15000);
        empl5.setDepartmentNumber(10);
    }


    public static void main(String[] args) {
        creatEmpl();


    }
}
