package com.softserve.edu04.Product;


public class Prod {
    private String Name;
    private Float Price;
    private Integer Quantity;

    public void setName(String Name) {
        this.Name =Name;
    }
    public String getName(){
        return this.Name;
        }

    public void setPrice(Float Price) {
        this.Price =Price;
    }
    public Float getPrice(){
        return this.Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity =Quantity;
    }
    public int getQuantity(){
        return this.Quantity;
    }

    public Prod(){
        Name ="";
        Price = 0.0f;
        Quantity = 0;
    }

    public Prod (String Name, float Price, int Quantity){
        this.Name =Name;
        return this.Price;
        this.Quantity =Quantity;
    }


}
