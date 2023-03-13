package com.softserve.edu12.practical_tasks.task2;

import java.io.IOException;

public class Plant extends ColorException{
    private int size;
    private Type type;
    private Color color;

    public Plant(int size, Type type, Color color) throws IOException {
        this.size = size;
        this.type = TypeException.possibleType(type);
        this.color = ColorException.possibleColor(color);

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
