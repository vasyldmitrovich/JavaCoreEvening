package com.softserve.edu01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FirstHomeTask {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Площадь и периметр круга
        int radius;
        double area, perimeter;
        double pi=3.14;

        System.out.println("What is flower bed's radius?");
        radius = Integer.parseInt(br.readLine());

        area = pi*Math.pow(radius,2);
        perimeter = pi*2*radius;

        System.out.printf("Flower bed's area = %.2f \n",area);
        System.out.printf("Flower bed's perimeter = %.2f \n",perimeter);

        //Ввод имени и адреса
        String name, address;

        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Where are you live, "+name);
        address = br.readLine();
        System.out.println(name+", you live in "+address);

        //Телефонные звонки
        double c1, c2, c3;
        double t1, t2, t3;
        double s1, s2, s3;

        System.out.println("What is price first call");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("How long is first call");
        t1 = Double.parseDouble(br.readLine());

        System.out.println("What is price second call");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("How long is second call");
        t2 = Double.parseDouble(br.readLine());

        System.out.println("What is price third call");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("How long is third call");
        t3 = Double.parseDouble(br.readLine());

        s1 = t1*c1;
        s2 = t2*c2;
        s3 = t3*c3;
        System.out.println("First call was "+t1+" minutes. It price was "+c1+". It cost "+s1);
        System.out.println("Second call was "+t2+" minutes. It price was "+c2+". It cost "+s2);
        System.out.println("Third call was "+t3+" minutes. It price was "+c3+". It cost "+s3);
        System.out.println("All countries talked together "+(t1+t2+t3)+" minutes. It cost "+(s1+s2+s3));
    }
}
