package com.softserve.edu04.homeTask;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstTask.checkFloat());
        FirstTask.minMax();
        FirstTask.errorCheck();

        Dog dog1 = new Dog("Bruno", Breed.Shepherd, 6);
        Dog dog2 = new Dog("Baron", Breed.Bulldog, 12);
        Dog dog3 = new Dog("Bruno", Breed.Terrier, 5);

        System.out.println("True if dogs have the same name, false against -> \n" + Dog.checkRepeats());
        Dog.checkOldest();
    }
}
