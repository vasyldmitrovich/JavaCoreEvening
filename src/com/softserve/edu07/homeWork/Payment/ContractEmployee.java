package com.softserve.edu07.homeWork.Payment;

import com.softserve.edu06.practicalTasks.car.UserEnter;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numFloat;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numb;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private float salary;

    public ContractEmployee(String name){
        this.name = name;
        this.salary = calculatePay();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = calculatePay();
    }
    public int federalTaxIdmember() {
        int min = 1000000;
        int max = 10000000;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
 //       System.out.println("FederalTaxIdmember: " + random_int);
        return random_int;
    }
    @Override
    public float calculatePay() {
        System.out.println(this.name);
        UserEnter.UserEnterNumFloat("Введіть місячну ставку працівника:");
        float monthlyPayment = numFloat;
        UserEnter.UserEnterNum("Введіть кількість робочих днів в місяці:");
        int workDays = numb;
        UserEnter.UserEnterNum("Введіть кількість відпрацьованих днів за місяць:");
        int days = numb;
        salary = (monthlyPayment / workDays) * days;
        System.out.println("Заробітня плата працівника: " + salary);
        System.out.println("_________________________________");
        return salary;
    }

    @Override
    public String toString(){
        String info = ("Ім'я працівника: " + name + ", заробітня плата: " + salary + ", ID: " + federalTaxIdmember());
        return info;
    }

}

