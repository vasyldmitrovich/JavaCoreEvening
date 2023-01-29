package com.softserve.edu07;

public record Dog(String name) implements Animal {


    public String makeNoise() {
        return "woof! woof!";
    }
}