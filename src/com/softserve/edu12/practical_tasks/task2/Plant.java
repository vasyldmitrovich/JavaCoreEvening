package com.softserve.edu12.practical_tasks.task2;

import java.io.IOException;

public class Plant extends ColorException {
    private final int size;
    private final Type type;
    private final Color color;

    public Plant(int size, Type type, Color color) {
        this.size = size;
        try {
            this.type = TypeException.possibleType(type);
            this.color = ColorException.possibleColor(color);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Plant [" + "size=" + size + ", type=" + type + ", color=" + color +"]";
    }
}
