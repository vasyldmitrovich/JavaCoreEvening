package com.softserve.edu08.PracticalTask;

public class Department  implements Cloneable{


    public class Adress {
        private String city;
        private String street;
        private int build;

        public Adress() {
            this.city = "";
            this.street = "";
            this.build = 0;
        }

        public Adress(String city, String street, int build) {
            this.city = city;
            this.street = street;
            this.build = build;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }




        @Override
        public String toString() {
            return "Name: " + name + "Adress: [City  " + city + ", Street  " + street + ", Build  " + build + "]";
        }
    }

    private Adress adress;
    String name;


    public Department() {
        adress = new Adress();
        name = "Victoria";
    }

    public Department(String city, String street, int build) {
        this();
        adress.city = city;
        adress.street = street;
        adress.build = build;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }



    @Override
    public String toString() {
        return "Department" +adress+ "Name:" +name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


