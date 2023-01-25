package com.softserve.edu05;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            Employees();
            Employee.employeeOfDept();
            Employee.salarySort();
        }

        public static void Employees() {
            Employee empl1 = new Employee("Petrenko ", 1, 15800);
            Employee emp2 = new Employee("Bozhenko ", 2, 78700);
            Employee empl3 = new Employee("Zavalska ", 3, 99300);
            Employee empl4 = new Employee("Klavdenko ", 4, 112000);
            Employee empl5 = new Employee("Rakubovchyk ", 5, 56000);

        }


        {
            int[] Numbers = {8, 17, 56, -7, -34, 27, 99, 3, 13, -8 - 9};
            System.out.println("MyNumbers" + Arrays.toString(Numbers));

            Display.biggest(Numbers);
            Display.positSum(Numbers);
            Display.AmountNeg(Numbers);
        }
    }
