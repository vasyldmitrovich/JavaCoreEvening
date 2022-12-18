package com.softserve.edu06.practicalTasks.color;

public class ColorLine extends Line {
    private String color;

    public ColorLine(){
        color = "white";
    }
    public ColorLine(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void Print() {
        System.out.println("Метод класу Color");
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Новий колір: " + color;
    }
}
