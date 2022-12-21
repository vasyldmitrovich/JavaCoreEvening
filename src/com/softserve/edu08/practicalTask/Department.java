package com.softserve.edu08.practicalTask;

public class Department implements Cloneable{

    private String name;
    private Address address;

    class Address implements Cloneable{

        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String city, String street, int building) {
        this.address = new Address(city,street,building);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department departmentCopy = (Department) super.clone();
        departmentCopy.address = (Address) departmentCopy.address.clone();
        return departmentCopy;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
