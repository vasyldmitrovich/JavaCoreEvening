package com.softserve.edu03.PracticalTask;

public class main {
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

        System.out.print("Total Salary" + Employee.totalSum);

    }

    {

    {

        /*Rename variable to lower case DONE */
        Person person1 = new Person("Марія", "Петрова", 1952);
        Person person2 = new Person("Анна", "Іванова", 1993);
        Person person3 = new Person("Сергій", "Триньков", 1927);
        Person person4 = new Person("Микола", "Петров", 2002);
        Person person5 = new Person("Ольга", "Квіткова", 1917);

        System.out.println(person1);
        System.out.print("Person1" + person1.getAge());
        System.out.println(person2);
        System.out.print("Person2" + person2.getAge());
        System.out.println(person3);
        System.out.print("Person3" + person3.getAge());
        System.out.println(person4);
        System.out.print("Person4" + person4.getAge());
        System.out.println(person5);
        System.out.print("Person5" + person5.getAge());

    }
    }


}
