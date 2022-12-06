package com.softserve.edu03.MyProjects;

/* Roman Sitko. Lesson 3. Example task */
public class Student {
    private String name;
    private int rating;
    private static int countStudents = 0;
    private static int sumRatings;

    public Student() {
        name = "";
        rating = 0;
    }

    public Student(String name, int rating) throws Exception {
        this.name = name;
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new Exception("Rating should be between 0 and 10");
        }
        countStudents += 1;
        sumRatings += rating;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating (int rating) {
        this.rating = rating;
    }

    public static int avgRating() {
        return sumRatings / countStudents;
    }

    public boolean betterStudent(com.softserve.edu03.Student s) {
        return false;
    }

    @Override
    public String toString() {
        return "Student #" + countStudents +
                ", Name: " + name +
                ", Rating: " + rating;
    }

    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Roman", 2);
        System.out.println(student1.toString());

        Student student2 = new Student("Viktor", 7);
        System.out.println(student2.toString());

        Student student3 = new Student("Vasyl", 5);
        System.out.println(student1.toString());

        System.out.println("Average ratings all students is: " + Student.avgRating());

    }

}
