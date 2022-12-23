package com.softserve.edu03.PracticalTask;

public class Employee {
    private String name;
    /*fields must bi in lower case, please rename fields and do change in all another methods*/
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


}
