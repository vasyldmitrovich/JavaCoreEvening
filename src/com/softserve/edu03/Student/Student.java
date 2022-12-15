package com.softserve.edu03.Student;

public class Student {
    private String name;
    private float rating;
    private static float avgRating = 0;
    private static int count = 0;
    private static int totalRating = 0;
    /*Plead use spaces between methods
    * And remember about consistency field constructors getters etc.*/
    public Student(){
        name = "";
        rating = 0;
        count++;
    }
    public Student(String name, float rating){
        this.name = name;
        this.rating = rating;
        count++;
        totalRating += rating;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRating(float rating){
        this.rating = rating;
    }
    public float getRating(){
        return rating;
    }

    public static float totalRating(){
        return totalRating;
    }
    public static float avgRating(){
        avgRating = (float) totalRating/count;
        return avgRating;
    }
    public boolean betterStudent(Student s){
       if (s.rating < this.rating){
            System.out.print("Кращим студентом є : " + this.name);
            return true;
         }
            System.out.print("Кращим студентом є : " + s.name);
            return false;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
