package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = sc.nextInt();
        int i = 1;
        int firstN = 0;
        int secondN = 1;

        System.out.println("Generate Fibonacci sequence  till " + number);
        while (i <= number) {
            System.out.print(firstN + ", ");

            int nextN = firstN + secondN;
            firstN = secondN;
            secondN = nextN;

            i++;
        }
    }
}
