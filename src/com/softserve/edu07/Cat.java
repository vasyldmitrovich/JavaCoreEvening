package com.softserve.edu07;

public record Cat(String name) implements Animal {


    public String makeNoise() {
        return "Meow!";
    }
}