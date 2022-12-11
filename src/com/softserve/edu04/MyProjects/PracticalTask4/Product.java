package com.softserve.edu04.MyProjects.PracticalTask4;

public class Product {
    private String name;
    private int price;
    private  int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void mostExpensive (Product[] p) {
        int a = 0;
//        for(Product i :  p) {
//            if(i.price >= i.price) {
//                System.out.println(i.price);
//            }
//        }
        System.out.println(p.length);
        for (int j = 0; j < p.length; j++) {
            if (p[j].price > p[j+1].price) {
                a = p[j].price;
            }
        }
        System.out.println(a);


//        int[] a = {7, 2, 8, 9, 0, 10};
//        int  b = 0;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] > a[i + 1]) {
//                b = a[i +1];
//                a[i + 1] = a[i];
//                a[i] = b;
//                b = a[i +1];
//            }
////            else {
////                b = a[i + 1];
////            }
//        }
//        System.out.println(b);

    }

}
