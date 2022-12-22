package com.softserve.edu08.HomeTasks;

public class Main {
    public static void main(String[] args) {
        createStudents();
    }

    public static void createStudents(){

        Student st1 = new Student(new FullName("Igor", "Tarasov"), 23, 4);
        Student st2 = new Student(new FullName("Olga", "Svetlova"), 20, 2);

        printFullInfo(st1);

        System.out.println();

        printFullInfo(st2);

        try{
            Student st3 = (Student) st1.clone();
            st3.setAge(25);
            st3.setCourse(3);
            st3.setLastName("Kozakov");

            System.out.println("\nAfter cloning:");
            printFullInfo(st3);
        }
        catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }
    }

    public static void printFullInfo(Student st){
        System.out.println(st.info());
        System.out.println(st.activity());
    }
}
