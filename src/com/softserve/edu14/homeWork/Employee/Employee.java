package com.softserve.edu14.homeWork.Employee;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private String department;
    private Integer age;
    static long repeat = 0L;

    static Optional <String> theMostPopularName;

    public Employee(String name, String department, Integer age){
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    static Optional<String> mostPopularName(Stream <Employee> employees) {
        try{
            if(Optional.of(employees)!=null){
        Map<String, Long> empl = employees.map(n->n.getName())
                  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        empl.forEach((k, v) -> {
            if(v > repeat){
                theMostPopularName = Optional.of(k);
            }
                System.out.println("Ім'я працівника: " + k + ", кількість повторень: " + v);
            });
         }
        } catch (NullPointerException e){

        theMostPopularName = Optional.empty();

        }

        System.out.println("Найбільш популярне ім'я: " + theMostPopularName.get());
        return theMostPopularName;

    }

    @Override
    public String toString(){
        return "Name: " + name + ", department: " + department + ", age:" + age;
    }
}
