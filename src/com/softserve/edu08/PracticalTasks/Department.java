package com.softserve.edu08.PracticalTasks;

public class Department implements Cloneable {
    private String name;
    private Address address = new Address();

    public Department(String name, String city, String street, int building) {
        this.name = name;
        address.city = city;
        address.street = street;
        address.building = building;
    }

    public void setCity(String city){
        address.setCity(city);
    }

    private class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }
}
