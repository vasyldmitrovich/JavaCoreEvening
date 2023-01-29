package com.softserve.edu07.Person;



public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){

        createArrayOfAnimals();

        System.out.println();
        createArrayOfPerson();
    }

    public static void createArrayOfAnimals(){
        Animal[] arrayOfAnimals = new Animal[5];

        arrayOfAnimals[0] = new Cat("Bars");
        arrayOfAnimals[1] = new Cat("Lucky");
        arrayOfAnimals[2] = new Dog("Patron");
        arrayOfAnimals[3] = new Cat("Simon");
        arrayOfAnimals[4] = new Dog("Foxy");

        System.out.println("Array of animals");
        for (Animal animal: arrayOfAnimals
        ) {
            System.out.println(animal+" "+animal.voice()+" "+animal.feed());
        }
    }

    public static void createArrayOfPerson(){
        Person[] arrayPerson = new Person[3];

        arrayPerson[0] = new Student("Nazar");
        arrayPerson[1] = new Teacher("Oleg", 15000);
        arrayPerson[2] = new Cleaner("Maria", 8000);

        for (Person person: arrayPerson
        ) {
            person.print();
            if (person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}


