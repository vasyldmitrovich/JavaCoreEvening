package com.softserve.edu05.MyProjects.HomeworkTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    private int[] num;
    private int sum, prod;

    public Calculate() {}

    public int[] inputArray (int[] in) throws IOException {
        num = new int[in.length];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 integer numbers: ");

        for (int i = 0; i < in.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        return num;
    }

    public void outputData(int inSuma, int inProd) {
        System.out.println("Suma: " + inSuma);
        System.out.println("Product: " + inProd);
    }

    public int[] getNum() {
        return num;
    }

    public int calcSuma (int[] num) {
        sum = 0;

        //find negative of first 5 elements
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] < 0) {
                tmp++;
            }
        }

        //if there aren't negative of first 5 elements, we calc sum first 5 elements.
        if (tmp == 0) {
            for (int i = 0; i < 5; i++) {
                sum += num[i];
            }
        }
        return sum;
    }

    public int calcProd (int[] num) {
        prod = 1;

        //find negative of first 5 elements
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] < 0) {
                tmp++;
            }
        }

        //if there are negative of first 5 elements, we calc sum last 5 elements.
        if (tmp != 0) {
            for (int i = num.length - 1; i >= 5; i--) {
                prod = num[i] * prod;
            }
        } else {
            prod = 0;
        }
        return prod;
    }

}
