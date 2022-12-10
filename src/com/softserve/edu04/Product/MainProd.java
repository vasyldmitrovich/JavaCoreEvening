package com.softserve.edu04.Product;


public class MainProd {
    public static void main(String[] args){
        Prod Something1 = new Prod(12, 2.5, 6);
        Prod Something2 = new Prod(Vaza, 6.5, 12);
        Prod Something3 = new Prod( Glue, 1.3, 45);
        Prod Something4 = new Prod(12, 15.3, 99);

         if (Something1.getPrice() > Something2.getPrice() && (Something1.getPrice() > Something3.getPrice() && (Something1.getPrice() > Something4.getPrice());
          System.out.println("Найдородчий продукт:" + Something1.getName() + "Кількість: " + Something1.getQuantity());
          else (Something2.getPrice() > Something3.getPrice() && (Something2.getPrice() > Something4.getPrice() && (Something2.getPrice() > Something1.getPrice());
        System.out.println("Найдородчий продукт:" + Something2.getName() + "Кількість: " + Something2.getQuantity());
        else (Something3.getPrice() > Something4.getPrice() && (Something3.getPrice() > Something1.getPrice() && (Something3.getPrice() > Something2.getPrice());
        System.out.println("Найдородчий продукт:" + Something3.getName() + "Кількість: " + Something3.getQuantity());
        else (Something4.getPrice() > Something1.getPrice() && (Something4.getPrice() > Something2.getPrice() && (Something4.getPrice() > Something3.getPrice());
        System.out.println("Найдородчий продукт:" + Something4.getName() + "Кількість: " + Something4.getQuantity());

        if (Something1.getQuantity() > Something2.getQuantity() && (Something1.getQuantity() > Something3.getQuantity() && (Something1.getQuantity() > Something4.getQuantity());
        System.out.println("Найбільше на залишку:" + Something1.getName() + "Кількість: " + Something1.getQuantity());
        else (Something2.getQuantity() > Something1.getQuantity() && (Something2.getQuantity() > Something3.getQuantity() && (Something2.getQuantity() > Something4.getQuantity());
        System.out.println("Найбільше на залишку:" + Something2.getName() + "Кількість: " + Something2.getQuantity());
        else (Something3.getQuantity() > Something2.getQuantity() && (Something3.getQuantity() > Something1.getQuantity() && (Something3.getQuantity() > Something4.getQuantity());
        System.out.println("Найбільше на залишку:" + Something3.getName() + "Кількість: " + Something3.getQuantity());
        else (Something4.getQuantity() > Something1.getQuantity() && (Something4.getQuantity() > Something2.getQuantity() && (Something4.getQuantity() > Something3.getQuantity());
        System.out.println("Найбільше на залишку:" + Something4.getName() + "Кількість: " + Something4.getQuantity());
    }


}
