package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = sc.nextLine();

        StringBuilder reverseStr = new StringBuilder();

        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " - this string is PALINDROME ");
        } else {
            System.out.println(str + " - this string is NOT PALINDROME ");
        }
    }
}
