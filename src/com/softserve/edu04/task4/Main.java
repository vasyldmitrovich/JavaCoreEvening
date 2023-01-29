package softserve.edu04.task4;

public class Main {
    public static void main(String[] args) {
        Product[] p = new Product[4];
        p[0] = new Product("Pepper", 2.0,20);
        p[1] = new Product("Garlic", 17.0,40);
        p[2] = new Product("Watermelon", 33.0,20);
        p[3] = new Product("Onion", 55.0, 20);

        System.out.println("Max price is " + Product.getMaxPrice() +" and its name is " + Product.getNameMaxPrice());
        System.out.println("Max quantity is "+ Product.getMaxQuantity()+ " and its name is " + Product.getNameMaxQuantity());
    }
}
