package com.softserve.edu10.homeTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runThird();
    }

    static void runFirstTask() {
        Set<Object> set = new HashSet<>();
        Set<Object> set1 = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);

        System.out.println(union(set, set1));
        System.out.println(intersection(set, set1));

    }

    static Set<Object> union(Set<Object> set1, Set<Object> set2) {
        for (Object obj : set1) {
            set2.add(obj); //addAll
        }
        return set2;
    }

    static Set<Object> intersection(Set<Object> set1, Set<Object> set2) {
        for (Object obj : set2) {
            if (!set1.contains(obj)) set2.remove(obj); //retainAll
        }
        return set2;
    }

    static void runSecond() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivan", "Valentin");
        map.put("Kyla", "Cervante");
        map.put("Jayson", "Cabrer");
        map.put("Macie", "Obrie");
        map.put("Grayson", "Rio");
        map.put("Leslie", "Hoffma");
        map.put("Omari", "Gentr");
        map.put("Sydney", "Man");
        map.put("Mckenzie", "Pined");
        map.put("Tammy", "Pined");
        System.out.println(map);

        map.keySet().removeIf(s -> map.get(s).equals("Pined"));

        System.out.println(map);
    }

    static void runThird() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Omari", 22));
        students.add(new Student("Omar", 20));
        students.add(new Student("Omarii", 22));
        students.add(new Student("Omariiii", 15));
        students.add(new Student("Oma", 17));

        Student.printStudents(students, 22);

        students.sort(new Student.compareByName());
        System.out.println(students);
        students.sort(new Student.compareByCourse());
        System.out.println(students);
    }
}
