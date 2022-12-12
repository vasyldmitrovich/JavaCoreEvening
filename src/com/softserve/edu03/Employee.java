package com.softserve.edu03;

public class Employee {
    private String name;
    private double Rate;
    private int Hours;

    static double totalSum;
    static double bonuses;
    static float percent = 0.1f;


        public  Employee(){
        name = "";
        Rate = 0.1;
        Hours = 22;
      }

      public  Employee (String Name){
        this.name = "";
        Rate = 0.1;
        Hours = 22;
      }

      public  Employee (String name, double rate, int Hours){
            this.name = name;
            this.Hours = Hours;
            this.Rate = rate;
      }

        public void setName(String name){
        this.name = name;
      }

      public double TotalSum(){
            return TotalSum();
      }

    public double getSalary(){
        totalSum += this.Rate * this.Hours;
        return this.Rate * this.Hours;
    }

    public double getBonuses(){
        bonuses = percent * totalSum;
        return percent * totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Ім'я='" + name +
                ", Ставка=" + Rate +
                ", Годин відпрацьовано=" + Hours +
                ", Нараховано бонусів=" + bonuses +
                '}';
    }

    public static void main (String[] args){
            Employee Staff1 = new Employee("Іванов", 100, 210);
            Employee Staff2 = new Employee("Петров", 75, 220);
            Employee Staff3 = new Employee("Кицін", 120, 20);

        System.out.println(Staff1);
        System.out.print("His salary and bonuses is" + Staff1.getSalary() + Staff1.getBonuses());
        System.out.println(Staff2);
        System.out.print("His salary and bonuses is" + Staff3.getSalary() + Staff2.getBonuses());
        System.out.println(Staff3);
        System.out.print("His salary and bonuses is" + Staff3.getSalary() + Staff3.getBonuses());

        System.out.print("Total Salery" + Employee.totalSum);

    }


}
