package com.softserve.edu10.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        runFirstTask();
        runSecondTask();
        runThirdTask();

    }

    public static void runThirdTask() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 4));
        students.add(new Student("Oleg", 2));
        students.add(new Student("Ivan", 3));
        students.add(new Student("Marta", 3));
        students.add(new Student("Igor", 1));

        Student.printStudents(students, 3);
        students.sort(new Student.CompareByName());
        System.out.println(students);
        students.sort(new Student.CompareByCourse());
        System.out.println(students);
    }

    public static void runFirstTask() {
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();

        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        set1.add(55);

        set2.add(66);
        set2.add(11);
        set2.add(22);
        set2.add(33);
        set2.add(44);

        System.out.println(intersect(set1, set2));
        System.out.println(union(set1, set2));

    }

    static Set<Object> union(Set<Object> set1, Set<Object> set2) {
        set1.addAll(set2);
        return set1;
    }

    static Set<Object> intersect(Set<Object> set1, Set<Object> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static void runSecondTask() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Polovenko", "Ihor");
        personMap.put("Belova", "Nika");
        personMap.put("Bobrov", "Victor");
        personMap.put("Ivasiv", "Alex");
        personMap.put("Martunenko", "Olha");
        personMap.put("Chub", "Tina");
        personMap.put("Hasman", "Ihor");
        personMap.put("Prohorenko", "Yaro");
        personMap.put("Tabunshik", "Mark");
        personMap.put("Krotov", "Ihor");

        personMap.forEach((key, value) -> System.out.println(key + " " + value));
        personMap.keySet().removeIf(s -> personMap.get(s).equals("Ihor"));
        System.out.println(personMap);
    }
}
