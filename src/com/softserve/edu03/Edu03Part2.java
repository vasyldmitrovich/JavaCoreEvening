package com.softserve.edu03;

/**
 * PRACTICAL TASK
 */
public class Edu03Part2 {
    public static void main(String[] args) {

        Employee first = new Employee("Max", 12, 50); //Created first object

        Employee second = new Employee(14, 65);//Created second object
        second.setName("Alex");

        Employee third = new Employee();//Created third object
        third.setName("Tom");
        third.setRate(15);
        third.setHours(48);

        System.out.println("The total salary of all workers: " + (Employee.totalSum = first.getSalary() + second.getSalary() + third.getSalary()));
        System.out.println( first.getBonuses() );
        System.out.println( first.getSalary());

    }
}

class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }

    public Employee() {//default constructor
    }

    public Employee(String name, int rate, int hours) {//constructors with parameters
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(int rate, int hours) {//constructors with parameters
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Name employ: " + name + ", rate: " + rate + ", worked hours: " + hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}