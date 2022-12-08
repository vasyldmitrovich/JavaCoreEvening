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
            case "ukraine", "france", "german", "poland", "italy", "united kingdom" -> {
                writeMessege(country+" is in "+Continents.EUROPE.getName());}
            case "australia", "new zealand", "papua new guinea", "Fiji" -> {
                writeMessege(country+" is in "+Continents.AUSTRALIA.getName());}
            case "nigeria", "ethiopia", "egypt", "tanzania", "south africa", "kenya"-> {
                writeMessege(country+" is in "+Continents.AFRICA.getName());}
            case "china", "india", "japan", "indonesia", "pakistan", "turkey", "iran" -> {
                writeMessege(country+" is in "+Continents.ASIA.getName());}
            case "usa", "canada", "mexico", "cuba", "haiti", "guatemala", "dominican republic" -> {
                writeMessege(country+" is in "+Continents.NORTH_AMERICA.getName());}
            case "brazil", "argentina", "peru", "chile", "colombia", "venezuela", "ecuador" -> {
                writeMessege("It is in "+Continents.SOUTH_AMERICA.getName());}
            default -> {
                writeMessege("There isn't information about this country");
            }
        }

    }

}
