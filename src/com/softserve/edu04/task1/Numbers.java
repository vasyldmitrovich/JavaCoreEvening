package softserve.edu04.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers
{
    public static void main(String[] args) throws IOException {
        int[] number =new int[3];
        int oddNumber=0;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        for (int i=0;i<3;i++){
            System.out.print("Please enter number "+ (i+1) +":");
            number[i] = Integer.parseInt(reader.readLine());
            if(number[i]%2!=0) oddNumber++;
        }
        System.out.print("There are "+ oddNumber + " odd numbers ");



    }
}
