package Third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double Pi=3.14;

        System.out.println("Введіть радіус клумби");
        int A = Integer.parseInt(br.readLine());

        System.out.println("Периметр клумби =" +2*A*Pi);
        System.out.println("Площа клумби =" +A*A*Pi);

              //System.out.println("You are " + B);
    }
}

