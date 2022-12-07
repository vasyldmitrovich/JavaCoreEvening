package com.softserve.edu04.PracticalTask4;

public class PracticalTask {

    public static boolean findOddNumber(int n) {

       return n%2 == 0 ? false : true;
    }

    public static void writeMessege(String s){
        System.out.println(s);
    }

    public static void showDayWeek(DaysWeek dw){
        writeMessege(dw.toString());
        writeMessege(dw.getEn());
        writeMessege(dw.getUa());
    }

    public static void getExpensive(Product prod1, Product prod2, Product prod3, Product prod4){

        Product expProduct;
        if (prod1.getPrice()>prod2.getPrice()) {
            expProduct = prod1;
        }
        else {expProduct = prod2;};

        if (prod3.getPrice()> expProduct.getPrice()){
            expProduct = prod3;
        };

        if (prod4.getPrice()> expProduct.getPrice()){
            expProduct = prod4;
        }

        writeMessege("The most expensive product is "+ expProduct.getName());
    }

    public static void getBiggestItem(Product prod1, Product prod2, Product prod3, Product prod4){

        Product bigProduct;
        if (prod1.getQuanity()>prod2.getQuanity()) {
            bigProduct = prod1;
        }
        else {bigProduct = prod2;};

        if (prod3.getQuanity()> bigProduct.getQuanity()){
            bigProduct = prod3;
        };

        if (prod4.getQuanity()> bigProduct.getQuanity()){
            bigProduct = prod4;
        }

        writeMessege("The biggest quantity has "+ bigProduct.getName());
    }

    public static void showContinent(String country){
        switch (country){
            case "Ukraine", "France", "German", "Poland", "Italy", "United Kingdom" -> {
                writeMessege(country+" is in "+Continents.EUROPE.getName());}
            case "Australia", "New Zealand", "Papua New Guinea", "Fiji" -> {
                writeMessege(country+" is in "+Continents.AUSTRALIA.getName());}
            case "Nigeria", "Ethiopia", "Egypt", "Tanzania", "South Africa", "Kenya"-> {
                writeMessege(country+" is in "+Continents.AFRICA.getName());}
            case "China", "India", "Japan", "Indonesia", "Pakistan", "Turkey", "Iran" -> {
                writeMessege(country+" is in "+Continents.ASIA.getName());}
            case "USA", "Canada", "Mexico", "Cuba", "Haiti", "Guatemala", "Dominican Republic" -> {
                writeMessege(country+" is in "+Continents.NORTH_AMERICA.getName());}
            case "Brazil", "Argentina", "Peru", "Chile", "Colombia", "Venezuela", "Ecuador" -> {
                writeMessege(country+" is in "+Continents.SOUTH_AMERICA.getName());}
            default -> {
                writeMessege("There isn't information about "+country);
            }
        }

    }

}
