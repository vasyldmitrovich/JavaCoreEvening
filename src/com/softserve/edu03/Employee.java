package com.softserve.edu03;

public class Employee {
    private String name;
    private double rate;
    private int hours;

    static double totalSum;

    static double percent = 0.1;

    public Employee(){
        name = "";
        rate = 0;
        hours = 0;
    }

    public Employee(String name){
        this.name = name;
        rate = 0;
        hours = 0;
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum = totalSum+this.getSalary();
    }


    public void setName(String name){
        this.name = name;
    }

    public void setRate(double rate){
        totalSum = totalSum-this.getSalary();
        this.rate = rate;
        totalSum = totalSum+this.getSalary();
    }

    public void setHours(int hours){
        totalSum = totalSum-this.getSalary();
        this.hours = hours;
        totalSum = totalSum+this.getSalary();
    }

    public String getName(){
        return this.name;
    }

    public double getRate(){
        return this.rate;
    }

    public int getHours(){
        return this.hours;
    }

    public double getSalary(){
        return this.rate*this.hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getBonus(){
        double sal = getSalary();
        return sal*percent;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vakulenko T.F.");

        Employee emp2 = new Employee("Tarasenko M.V.", 120, 20);

        Employee emp3 = new Employee("Kozachenko G.T", 100, 40);

        emp1.setRate(150);
        emp1.setHours(50);

        System.out.println(emp1);
        System.out.printf("His salary is %.2f. His bonus is %.2f \n", emp1.getSalary(), emp1.getBonus());
        System.out.println(emp2);
        System.out.printf("His salary is %.2f. His bonus is %.2f \n", emp2.getSalary(), emp2.getBonus());
        System.out.println(emp3);
        System.out.printf("His salary is %.2f. His bonus is %.2f \n", emp3.getSalary(), emp3.getBonus());

        System.out.print("\n");

        System.out.println("Total salary is "+Employee.totalSum);
    }
}
