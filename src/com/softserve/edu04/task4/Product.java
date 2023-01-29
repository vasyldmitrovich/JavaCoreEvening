package softserve.edu04.task4;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private static double maxPrice;
    private static String nameMaxPrice;
    private static int maxQuantity;
    private static String nameMaxQuantity;

    public static double getMaxPrice() {
        return maxPrice;
    }

    public static void setMaxPrice(double maxPrice) {
        Product.maxPrice = maxPrice;
    }

    public static String getNameMaxPrice() {
        return nameMaxPrice;
    }

    public static void setNameMaxPrice(String nameMaxPrice) {
        Product.nameMaxPrice = nameMaxPrice;
    }

    public static int getMaxQuantity() {
        return maxQuantity;
    }

    public static void setMaxQuantity(int maxQuantity) {
        Product.maxQuantity = maxQuantity;
    }

    public static String getNameMaxQuantity() {
        return nameMaxQuantity;
    }

    public static void setNameMaxQuantity(String nameMaxQuantity) {
        Product.nameMaxQuantity = nameMaxQuantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        checkPrice(price, name);
        checkQuantity(quantity, name);

    }

    private void checkPrice(double price, String name){
        if(maxPrice<=price){
            maxPrice=price;
            nameMaxPrice =name;
        }
    }

    private void checkQuantity(int quantity, String name){
        if(maxQuantity<=quantity){
            maxQuantity=quantity;
            nameMaxQuantity=name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
