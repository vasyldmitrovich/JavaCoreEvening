package com.softserve.edu03;

public class Employee {
    private String name;
    private float rate;
    private int hours;
    float salary;
    protected static float totalSum;

    public String getName (){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public float getRate (){
        return this.rate;
    }
    public void setRate(float newRate){
        this.rate = newRate;
    }

    public int getHours (){
        return this.hours;
    }
    public void setHours(int newHours){
        this.hours = newHours;}

    public Employee(){
        name = "";
        rate = 0;
        hours = 0;
    }
    public Employee(String name, float rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name){
        this.name = name;
        rate = 0;
        hours = 0;
    }
    public float getSalary(){
        salary = this.rate * this.hours;
        System.out.println(this.name + " : salary = " + salary);
        totalSum += salary;
        return salary;
    }

    public String toString(){
    return "Employee: name = " + name + ", rate = " + rate + ", hours = " + hours;
    }

    public float getBonuses(){
        float bonus = (float) (salary * 0.1);
        System.out.println(this.name + " : bonus = " + bonus);
        return bonus;
    }

}
