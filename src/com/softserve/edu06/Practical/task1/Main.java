package Practical.task1;

public class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[5];
        arr[0]= new Truck("KIA", 140, 2008);
        arr[1]= new Sedan("Hyundai Sonata", 220, 2017);
        arr[2]= new Truck("Ford F150", 160, 2022);
        arr[3]= new Sedan("Hyundai Sonata 2016", 180, 2006);
        arr[4]= new Truck("Ford F35", 120, 1992);

        System.out.println("Array of trucks:");
        for (Car car : arr) {
            System.out.println(car.toString());
        }
    }
}
