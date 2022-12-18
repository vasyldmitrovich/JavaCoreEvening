package com.softserve.edu03.PracticalTask;

public class Emloyee {
    private String name;
    private double rate;
    private int hours;
    static int totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Emloyee() {

    }

    public Emloyee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary(){
         return rate * hours;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getBonuses(){
        totalSum += this.rate * this.hours;
        return rate * hours * 0.1;
    }

    public static void main(String[] args) {
        Emloyee emp1 = new Emloyee("Chip", 100, 20);
        Emloyee emp2 = new Emloyee("Dale", 120, 25);
        Emloyee emp3 = new Emloyee();
        emp3.setName("Monty");
        emp3.setRate(150);
        emp3.setHours(40);


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("Bonuses 10%");
        System.out.print("Total salary: ");
        System.out.println(emp1.getSalary() + emp2.getSalary() + emp3.getSalary() + emp1.getBonuses() + emp2.getBonuses()
        + emp3.getBonuses());

    }
}
