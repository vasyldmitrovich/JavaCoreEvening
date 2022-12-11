package softserve.edu04.HomeWork;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //        read 3 float numbers and check: are they all belong to the range [-5, 5];

        System.out.println("Input 3 float numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float[] arr = {a, b, c};
        for (int i= 0; i< arr.length; i++)
            if (arr[i] >= -5 && arr[i] <= 5) {
                System.out.println("Number " + arr[i] + " belong to the range [-5, 5]");
            } else {
                System.out.println("Number " + arr[i] + " does not belong to the range [-5, 5]");
            }

    //        read 3 integer numbers and write max and min of them;

        System.out.println("Input 3 integer numbers");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int max = Math.max(a1, Math.max(b1, c1));
        System.out.println("max= " + max);

        int min = Math.min(a1, Math.min(b1, c1));
        System.out.println("min= " + min);


    //        read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

        System.out.println("Input number of HTTP Error");
        int error = sc.nextInt();

        switch (error) {
            case 400 -> System.out.println(Errors.Bad_Request);
            case 401 -> System.out.println(Errors.Unauthorized);
            case 402 -> System.out.println(Errors.Payment_Required);
            case 403 -> System.out.println(Errors.Forbidden);
            case 404 -> System.out.println(Errors.Not_Found);
            default -> System.out.println("No such error");
        }

    }
}

enum Errors {
    Bad_Request(400),

    Unauthorized(401),

    Payment_Required(402),

    Forbidden(403),

    Not_Found(404);

    private int error;

    Errors(int error) {
    }

    public int getError() {
        return error;
    }
}
