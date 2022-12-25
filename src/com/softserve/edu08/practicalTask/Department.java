package com.softserve.edu08.practicalTask;

public class Department implements Cloneable{
    private String name;
    private Address address;

    public Department(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building){
            this.city = city;
            this.street = street;
            this.building = building;
        }
        public String getCity(){
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet(){
            return street;
        }

        public int getBuilding() {
            return building;
        }
        public void setBuilding(int building){
            this.building = building;
        }
        public void Info(){
            System.out.println("Name: " + name + ". Address: " + city +  " , " + street + " , " + building);
        }
        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Department copyDepartment = (Department) super.clone();
        copyDepartment.address = (Address) copyDepartment.address.clone();
        return copyDepartment;
    }
}
