package com.softserve.edu12.practicalTask;


public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(String type, String color, int size) throws TypeException, ColorException {
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (Exception typeEx) {
            throw new TypeException("Invalid value " + type + " for field type");
        }
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (Exception colorEx) {
            throw new ColorException("Invalid value " + color + " for field color");
        }
        this.size = size;
    }

    @Override
    public String toString() {
        return "{type: " + type + ", color: " + color + ", size: " + size + "}";
    }
}

enum Color {
    WHITE, RED, BLUE
}

enum Type {
    TREE, SHRUB, CREEPER, CLIMBER, HERB
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}
