package com.softserve.edu05.PracticalTask;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        Employees();
        Employee.employeeOfDept();
        Employee.salerySort();
    }

    public static void Employees(){
        Employee empl1 = new Employee("Stepanov ", 56 , 12500 );
        Employee empl2 = new Employee("Kolodenko ", 56 , 35200 );
        Employee empl3 = new Employee("Stefania ", 13 , 55200 );
        Employee empl4 = new Employee("Derkach ", 13 , 24000 );
        Employee empl5 = new Employee("Kushnir ", 13 , 34000 );

    }



    {
        int[] Numbers = {4, 12, -8, 6, -22, 33, 2, 45, 9, 2 - 21};
        System.out.println("MyNumbers" + Arrays.toString(Numbers));

        Display.bigest(Numbers);
        Display.positSum(Numbers);
        Display.AmountNeg(Numbers);
    }

    }
