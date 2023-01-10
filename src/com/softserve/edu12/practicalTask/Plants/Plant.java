package com.softserve.edu12.practicalTask.Plants;

public class Plant {
    int size;
    Color color;
    Type type;

    enum Color{
        GREEN, RED, YELLOW;
    }

    enum Type{
        HERB, TREE, CLIMBER, CREEPER, SHRUB;
    }


    public Plant(int size, String color, String  type) {
        this.size = size;
        boolean n = false, m = false;

        try{
            for (Color elem: Color.values()) {
                if(elem.toString().equals(color.toUpperCase())){
                    this.color = Color.valueOf(color.toUpperCase());
                    n = true;
                }
            }
            if (n == false){
                throw new ColorException("Рослин з таким кольором не існує");
            }
        }catch (ColorException e){
            e.printStackTrace();
        }

        try{
            for (Type elemType: Type.values()) {
                if(elemType.toString().equals(type.toUpperCase()) ){
                    this.type = Type.valueOf(type.toUpperCase());
                    m = true;
                }
            }
            if (m == false){
                throw new TypeException("Такого виду рослин не існує");
            }
        }catch (TypeException ex){
            ex.printStackTrace();
        }
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        if(type == null || color == null){
            return "Невірно введені дані";
        }else{
            return "Type: " + type + ", size: " + size + ", color: " + color;
        }
    }
}

