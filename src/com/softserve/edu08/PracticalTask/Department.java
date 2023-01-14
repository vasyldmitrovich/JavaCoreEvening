package com.softserve.edu08.PracticalTask;

public class Department implements Cloneable {

    private String name;
    private Address address;

    public Department() {
        this.name = "";
        this.address = new Address();
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address address() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    static class Address implements Cloneable {

        private String city;
        private String street;
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

        public String city() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String street() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int building() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address [" + "city = " + city + ", street = " + street + ", building = " + building + ']';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public String toString() {
        return "\nDepartment = [" + "name = " + name + ", address = " + address + ']';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
