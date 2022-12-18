package com.softserve.edu06.practicalTasks.color;

public class Point {
    private int x;
    private int y;

    public Point(){
        x = 1;
        y = 1;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void Print() {
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}