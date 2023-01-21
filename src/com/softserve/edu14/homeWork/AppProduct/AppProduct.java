package com.softserve.edu14.homeWork.AppProduct;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppProduct {
    public static void main(String[] args) {
        List<Product> prod = new ArrayList<>();
        prod.add(new Product("Phone", "06.11.2022", 2500));
        prod.add(new Product("Wash machine", "25.12.2022", 5000));
        prod.add(new Product("Mixer", "01.01.2023", 800));
        prod.add(new Product("Phone", "01.01.2021", 3500));
        prod.add(new Product("Toasters", "21.04.2022", 1700));
        prod.add(new Product("Kettles", "09.09.2021", 500));
        prod.add(new Product("Phone", "10.01.2023", 4700));
        prod.add(new Product("Phone", "05.06.2022", 4500));
        prod.add(new Product("Toasters", "03.10.2021", 1500));
        prod.add(new Product("Wash machine", "25.10.2020", 3200));
        prod.add(new Product("Coffee machine", "02.03.2022", 4600));
        prod.add(new Product("Toasters", "03.11.2019", 1500));
        prod.add(new Product("Coffee machine", "12.05.2022", 4500));
        prod.add(new Product("Phone", "05.10.2022", 4600));
        prod.add(new Product("Mixer", "01.10.2021", 800));
        prod.add(new Product("Mixer", "01.01.2019", 900));


        List<Product> sortedList = (List<Product>) prod.stream()
                .filter(el -> el.getPrice()>3000 && el.getCategory() == "Phone"
                        && el.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)) )
                .collect(Collectors.toList());

        System.out.println("Відсортований список: " + sortedList);


    }
}
