package com.softserve.edu03;

/* Roman Sitko. Lesson 3. Example task*/
public class MyStudent {
    private String name;
    private int rating;
    private static int countStudents = 0;
    private static int sumRatings;

    public MyStudent () {
        name = "";
        rating = 0;
    }

    public MyStudent (String name, int rating) throws Exception {
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

    public boolean betterStudent(Student s) {
        return false;
    }

    @Override
    public String toString() {
        return "Student #" + countStudents +
                ", Name: " + name +
                ", Rating: " + rating;
    }

    public static void main(String[] args) throws Exception {
        MyStudent student1 = new MyStudent("Roman", 2);
        System.out.println(student1.toString());

        MyStudent student2 = new MyStudent("Viktor", 7);
        System.out.println(student2.toString());

        MyStudent student3 = new MyStudent("Vasyl", 5);
        System.out.println(student1.toString());

        System.out.println("Average ratings all students is: " + MyStudent.avgRating());

    }

}
