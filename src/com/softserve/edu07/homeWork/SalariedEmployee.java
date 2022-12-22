package com.softserve.edu07.homeWork;

import com.softserve.edu06.practicalTasks.car.UserEnter;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numFloat;
import static com.softserve.edu06.practicalTasks.car.UserEnter.numb;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private float salary;

    public SalariedEmployee(String name){
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

    public int socialSecurityNumber() {
        int min = 100000000;
        int max = 1000000000;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
 //       System.out.println("SocialSecurityNumber: " + random_int);
        return random_int;
    }
    @Override
    public float calculatePay(){
        System.out.println(this.name);
        UserEnter.UserEnterNumFloat( "Введіть годинну ставку працівника:");
        float rate = numFloat;
        UserEnter.UserEnterNum("Введіть кількість відпрацьованих годин:");
        int hours = numb;
        salary = hours * rate;
        System.out.println("Заробітня плата працівника: " + salary);
        System.out.println("_________________________________");
        return salary;
    }
    @Override
    public String toString(){
        String info =  ("Ім'я працівника: " + name + ", заробітня плата: " + salary + ", ID: " + socialSecurityNumber());
        return info;
    }

}
