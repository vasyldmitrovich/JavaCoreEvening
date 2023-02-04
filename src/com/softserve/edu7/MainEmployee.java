package com.softserve.edu7;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        Employee emp1 = new ContractEmployee("Contract", 1, 60, 8);
        Employee emp2 = new ContractEmployee("Contract", 2, 100, 8);
        Employee emp3 = new SalariedEmployee("Salaried", "55", "Yulia", 10000);
        Employee emp4 = new SalariedEmployee("Salaried", "56", "Oleg", 8000);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.sort((e1, e2) -> -e1.calculatePay()+e2.calculatePay());

        System.out.println("Entire sequence of workers descending the average monthly\n" +
                "wage" + list);
        }
    }

