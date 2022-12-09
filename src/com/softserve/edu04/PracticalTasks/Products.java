package softserve.edu04.PracticalTasks;

public class Products {
    String name;
    double price;
    double quantity;
    static double MostExpensivePrice;
    static double biggestQuantity;

    public Products(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if (price >= MostExpensivePrice) {
            MostExpensivePrice = price;
        }
        if (quantity >= biggestQuantity) {
            biggestQuantity= quantity;
        }
    }

    public static double getMostExpensivePrice() {
        return MostExpensivePrice;
    }

    public static double getBiggestQuantity() {
        return biggestQuantity;
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
        this.price = this.price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args){
        Products product1 = new Products("Potato", 20, 30);
        Products product2 = new Products("Onion", 50, 15);
        Products product3 = new Products("Cheese", 250, 0.4);
        Products product4 = new Products("Bread", 20, 1);

        Products[] array = {product1, product2, product3, product4};

        for (Products prod: array){
            if (prod.getPrice() == getMostExpensivePrice()){
                System.out.println("Most Expensive: " + prod.getName() + ".  Quantity: " + prod.getQuantity());

            }
            if (prod.getQuantity() == getBiggestQuantity()){
                System.out.println("The biggest quantity: " + prod.getName());
            }
        }

        
    }
}
