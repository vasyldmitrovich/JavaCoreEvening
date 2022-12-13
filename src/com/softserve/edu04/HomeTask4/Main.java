package com.softserve.edu04.HomeTask4;

public class Main {

    public static void main(String[] args) {
        go();
    }

    public static void go(){
        HomeTask.checkBelonging();

        HomeTask.findMaxMin();

        HomeTask.writeNameError();

        Dog dog1 = new Dog("Pirate", Breed.BEAGLE, 2);
        Dog dog2 = new Dog("Blacky", Breed.POODLE, 4);
        Dog dog3 = new Dog("Pirate", Breed.BASENJI, 1);

        HomeTask.equalDogsName(dog1, dog2);
        HomeTask.equalDogsName(dog3, dog2);
        HomeTask.equalDogsName(dog1, dog3);

        HomeTask.findOldestDog(dog1, dog2, dog3);
    }

}
