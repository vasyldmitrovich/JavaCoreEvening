package softserve.edu05.HomeWork;

import java.util.Scanner;

public class Car {
    String type;
    int yearOfProduction;
    double engine;

    public Car(String type, int yearOfProduction, double engine) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("Sedan", 2005, 1);
        Car car2 = new Car("Coupe", 2000, 1.4);
        Car car3 = new Car("Minivan", 2017, 2.2);
        Car car4 = new Car("HatchBack", 2015, 2);

        Car[] cars = {car1, car2, car3, car4};
        System.out.println("Input year of production");
        int year = sc.nextInt();
        for (Car value : cars) {
            if (value.getYearOfProduction() == year) {
                System.out.println(value);
            }
        }

        System.out.println();

        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }

        for (Car car: cars){
            System.out.println(car);
        }
    }
}


