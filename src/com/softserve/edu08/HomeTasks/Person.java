package com.softserve.edu08.HomeTasks;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setLastName(String lastName) {
        this.fullName.setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        this.fullName.setFirstName(firstName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "First name: "+fullName.getFirstName()+", Last name: "+fullName.getLastName()+", Age: "+age;
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }
}
