package com.softserve.edu08;

public class Department implements Cloneable {

    private String name;
    private Address address;


    public static class Address implements Cloneable {
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

        public void setBuilding(int building) {
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

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
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
        return copyOfDepartment;
    }


    }


