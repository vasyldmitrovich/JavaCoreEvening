package com.softserve.edu04.HomeWork;


public class Dogs {
    String name;
    Breed breed;
    int age;
    static int oldestDog;



    public Dogs(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        if (age > oldestDog) {
            oldestDog = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dogs dog1 = new Dogs("MAX", Breed.Labrador, 15);
        Dogs dog2 = new Dogs("PLUTO", Breed.FrenchBulldog, 3);
        Dogs dog3 = new Dogs("DUKE", Breed.GermanShepherd, 4);

        Dogs[] array = {dog1, dog2, dog3};
        for (Dogs dog : array){
            if (dog.getAge() == oldestDog)
                System.out.println("The oldest dog: " + dog.getName() + ", " + dog.getBreed() + ", age: " + dog.getAge());
        }

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())){
            System.out.println("There is two dogs with the same name");
        }
        else {
            System.out.println("There is no two dogs with the same name");
        }
    }

    enum Breed {
        GoldenRetriever,
        Labrador,
        FrenchBulldog,
        Beagle,
        GermanShepherd
    }
}
