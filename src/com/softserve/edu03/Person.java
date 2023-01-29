package softserve.edu03;

import java.time.Year;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        return Year.now().getValue()-birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYear(birthYear);
    }

    public String output(){
        return("Name: " + this.firstName + " Surname: " + this.lastName + " Birth Year: " + this.birthYear + " Age: "+ getAge());
    }

    public void changeName(String fn, String ln){
    this.firstName=fn;
    this.lastName=ln;
    }


}
