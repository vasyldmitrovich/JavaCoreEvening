package com.softserve.edu04.HomeTask4;

import java.util.Scanner;

public class HomeTask {
    public static void checkBelonging(){
        float limit1 = -5;
        float limit2 = 5;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        float num1 = in.nextFloat();

        System.out.println("Input a number: ");
        float num2 = in.nextFloat();

        System.out.println("Input a number: ");
        float num3 = in.nextFloat();

        if ((num1>=limit1 && num1<=limit2) && (num2>=limit1 && num2<=limit2) && (num3>=limit1 && num3<=limit2)){
            System.out.println("All numbers belong to the range [-5,5]");
        }
        else {System.out.println("Not all numbers belong to the range [-5,5]"); }
    }

    public static void findMaxMin(){
        /*The next two line you can put in another method
        * you send message in that method
        * in that method you pring that messate
        * after that you read keyboard and return from that method value what user input
        * And after that write that data to variable*/
        System.out.println("Input a number: ");
        int num1 = myScanner.scan.nextInt();

        System.out.println("Input a number: ");
        int num2 = myScanner.scan.nextInt();

        System.out.println("Input a number: ");
        int num3 = myScanner.scan.nextInt();

        int max, min;

        if (num1>num2) {
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }

        if (num3>max) {max = num3;}
        else if(num3<min) {min = num3;}

        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }

    public static void writeNameError(){
        System.out.println("Input number error");
        int error = myScanner.scan.nextInt();

        switch (error) {
            case 400: {System.out.println(HttpErrors.BAD_REQUEST.getName()); break;}
            case 401: {System.out.println(HttpErrors.UNAUTHORIZED.getName()); break;}
            case 402: {System.out.println(HttpErrors.PAYMENT_REQUIRED.getName()); break;}
            case 403: {System.out.println(HttpErrors.FORBIDDEN.getName()); break;}
            case 404: {System.out.println(HttpErrors.NOT_FOUND.getName()); break;}
            case 405: {System.out.println(HttpErrors.METHOD_NOT_ALOWED.getName()); break;}
            case 406: {System.out.println(HttpErrors.NOT_ACCEPTABLE.getName()); break;}
            case 407: {System.out.println(HttpErrors.PROXY_AUTHENTICATION_REQUIRED.getName()); break;}
            case 408: {System.out.println(HttpErrors.REQUEST_TIMEOUT.getName()); break;}
            case 409: {System.out.println(HttpErrors.CONFLICT.getName()); break;}
            case 410: {System.out.println(HttpErrors.GONE.getName()); break;}
            case 411: {System.out.println(HttpErrors.LENGTH_REQUIRED.getName()); break;}
            case 412: {System.out.println(HttpErrors.PRECONDITION_FAILED.getName()); break;}
            case 413: {System.out.println(HttpErrors.REQUEST_ENTITY_TOO_LARGE.getName()); break;}
            case 414: {System.out.println(HttpErrors.REQUEST_URI_TOO_LONG.getName()); break;}
            case 415: {System.out.println(HttpErrors.UNSUPPORTED_MEDIA_TYPE.getName()); break;}
            case 416: {System.out.println(HttpErrors.REQUEST_RANGE_NOT_SATISFIABLE.getName()); break;}
            case 417: {System.out.println(HttpErrors.EXPECTION_FAILED.getName()); break;}
            default: {System.out.println("This number error does not found");}
        }
    }

    public static void equalDogsName(Dog dog1, Dog dog2) {
        if (dog1.equalsName(dog2)) {
            System.out.println("These dogs have same names: "+dog1 + " and "+dog2);
        }
    }

    public static void findOldestDog(Dog dog1, Dog dog2, Dog dog3){

        Dog oldestDog;

        if (dog1.getAge()>dog2.getAge()) {
            oldestDog = dog1;
        }
        else {
            oldestDog = dog2;
        }

        if (dog3.getAge()>oldestDog.getAge()) {oldestDog = dog3;}

        System.out.println("The oldest dog is "+oldestDog);
    }
}
