package com.softserve.edu06.practicalTask;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println(this.getClass().getSimpleName() + " is printing");
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
