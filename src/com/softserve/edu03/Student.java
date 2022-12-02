package com.softserve.edu03;

public class Student {
    private String name;
    private float rating;
    static int count = 0;
    static float totalRating;
    static float avRating;

    public Student() {
        name = "";
        rating = 0;
        count++;
    }

    public Student(String name, float rating){
        this.name = name;
        this.rating = rating;
        count++;
        totalRating = totalRating+rating;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRating(float rating){
        totalRating = totalRating-this.rating+rating;
        this.rating = rating;

        System.out.println("New rating "+this.name+" is "+this.rating);
    }

    public String getName(){
        return this.name;
    }

    public float getRating(){
        return this.rating;
    }
    static float avgRaiting(){
        avRating = totalRating/count;
        return avRating;
    }

    public boolean betterStudent(Student s){
        if (this.rating>s.rating)
        {return true;}
        else
        {return false;}
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student("Maria",10);

        Student st2 = new Student("Makar",8);

        Student st3 = new Student("Lesya",12);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.print("\n");
        System.out.println("Total rating is "+Student.totalRating);
        System.out.println("Average rating is "+Student.avgRaiting());

        System.out.print("\n");
        st2.setRating(10);

        System.out.println("Total rating is "+Student.totalRating);
        System.out.println("Average rating is "+Student.avgRaiting());

        System.out.print("\n");
        System.out.println("Is "+st1.getName()+" better then "+st3.getName());
        System.out.println("It's "+st1.betterStudent(st3));

        System.out.print("\n");
        System.out.println("Is "+st3.getName()+" better then "+st2.getName());
        System.out.println("It's "+st3.betterStudent(st2));
    }
}
