package com.softserve.edu05.MyProjects.HomeworkTask2;

import java.io.IOException;

/* Roman Sitko.
Enter 10 integer numbers.
Calculate the sum of first 5 elements
if they are positive or product of last 5 element in the other case.
*/
public class Main {

    public static void main(String[] args) throws IOException {
        run();

    }

    public static void run() throws IOException {
        Calculate calculate = new Calculate();
        int outputSuma, outputProd;
        calculate.inputArray(new int[10]);

        outputSuma = calculate.calcSuma(calculate.getNum());
        outputProd = calculate.calcProd(calculate.getNum());
        calculate.outputData(outputSuma, outputProd);
    }
}
