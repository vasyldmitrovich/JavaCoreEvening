package com.softserve.edu12.practical_tasks.task2;

public class Plant extends ColorException{
    private int size;
    private Type type;
    private Color color;

    public Plant(int size, String type, String color)  {
        this.size = size;
        this.type = Type.valueOf(type);
        this.color = Color.valueOf(color);

    }



    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", type=" + type +
                ", color=" + color +
                '}';
    }
}
