package softserve.edu03.PracticalTask;


public class Employee {

    private String name;
    private double rate;
    private int hours;
    private double bonus = 1.1;

    static double totalSum;

    Employee(String name, double rate, int hours){
        this.setName(name);
        this.setRate(rate);
        this.setHours(hours);
        totalSum=rate*hours;
    }


    public String getName() {return name;}

    public double rate() {return rate;}

    public int hours() {return hours;}

    public void setName(String name) {this.name=name;}

    public void setRate(double rate) {this.rate=rate;}

    public void setHours(int hours) {this.hours=hours;}



    @Override
    public String toString() {
        return name+", "+rate+", "+hours;
    }
    public double getSalary() {
        return totalSum=this.hours*this.rate;
    }
    public double getBonuses() {
        return this.hours*this.rate*bonus;
    }




}


