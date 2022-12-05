package softserve.edu03.Homework;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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

    public Person() {

    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public static int getAge(Person person){
        return 2022- person.getBirthYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }


    public static void main(String[] args) {
        Person person1 = new Person("John", "Lennon", 1940);
        Person person2 = new Person("Paul", "McCartney", 1942);
        Person person3 = new Person("George", "Harrison", 1943);
        Person person4 = new Person("Ringo", "Starr", 1940);
        Person person5 = new Person("Mick", "Jagger", 1943);

        person1.changeName("Keith", "Richards");

        System.out.println(person1.getFirstName()+ " " + person1.getAge(person1) + " years");
        System.out.println(person2.getFirstName()+ " " + person2.getAge(person2) + " years");
        System.out.println(person3.getFirstName()+ " " + person3.getAge(person3) + " years");
        System.out.println(person4.getFirstName()+ " " + person4.getAge(person4) + " years");
        System.out.println(person5.getFirstName()+ " " + person5.getAge(person5) + " years");

    }
}
