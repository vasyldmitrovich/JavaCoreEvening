package com.softserve.edu04.PracticalTask.p4;

public record Product(String name, int price, int quantity) {
    private static String nameMostExpensive;
    private static String nameBiggestQuantity;

    public static void mostExpensive(Product[] p) {
        int mostExpensive = p[0].price;
        for (Product product : p) {
            if (product.price > mostExpensive) {
                mostExpensive = product.price;
            }
            if (product.price == mostExpensive) {
                nameMostExpensive = product.name;
            }
        }
        System.out.println("Most expensive item: " + nameMostExpensive + ", price: " + mostExpensive);
    }

    public static void biggestQuantity(Product[] p) {
        int biggestQuantity = p[0].quantity;
        for (Product product : p) {
            if (product.quantity > biggestQuantity) {
                biggestQuantity = product.quantity;
            }
            if (product.quantity == biggestQuantity) {
                nameBiggestQuantity = product.name;
            }
        }
        System.out.println("Name of biggest quantity of item: " + nameBiggestQuantity + ", quantity: " + biggestQuantity);
    }
}
