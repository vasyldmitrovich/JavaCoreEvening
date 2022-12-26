package com.softserve.edu08.MyProjects.PracticalTask1;

public class Department {

    private String name;
    private Address address;


    class Address {
        private String city, street;
        private int building;

        public Address() {
            this.city = "";
            this.street = "";
            this.building = 0;
        }

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "city " + city +
                    ", str. " + street +
                    ", building " + building;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public Department() {
        address = null;
        this.name = "";
        address.city = "";
        address.building = 0;
        address.street = "";
    }

    public Department(String name, String city, String street, int building) {
        address = new Address();
        this.name = name;
        address.city = city;
        address.building = building;
        address.street = street;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ". Address: " + address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return super.clone();
    }

/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }*/

}
