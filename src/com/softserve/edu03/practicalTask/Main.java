package com.softserve.edu03.practicalTask;


public class Main {


    public static void main(String[] args) {
        /*Make in that class some method like
        public static run()
        and in that method create all that objects
        after that print information*/
        Employee Dan = new Employee("Dan", 5, 20);
        Employee Mike = new Employee("Mike", 7, 10);
        Employee Jake = new Employee("Jake", 1, 3);

        System.out.println("Salary of all workers - " + Employee.getTotalSum());
    }
}
