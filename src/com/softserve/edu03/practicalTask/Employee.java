package com.softserve.edu03.practicalTask;

public class Employee {

    private String name;

    private double rate;

    private int hours;

    private static double totalSum;

    public Employee(){
        this.name = "";
    };

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary(){
        totalSum += this.rate * this.hours;
        return this.rate * this.hours;
    }

    public double getBonuses(){
        totalSum += (this.rate * this.hours) * 0.1;
        return (this.rate * this.hours) * 0.1;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
