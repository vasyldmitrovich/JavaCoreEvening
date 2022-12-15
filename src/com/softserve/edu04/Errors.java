package com.softserve.edu04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errors {
    public enum Err{
        BADREQ(400, "Bad Request"),
        UNAUTH(401, "Unauthorized"),
        PAYREQ(402, "Payment Required");

        private int errNumber;
        private String errName;
        private Err(int errNumber, String errName){
            this.errNumber = errNumber;
            this.errName = errName;
        }
        public void SetErrNumber(int errNumber){
            this.errNumber = errNumber;
        }
        public int GetErrNumber(){
            return errNumber;
        }
        public void SetErrName(String errName){
            this.errName = errName;
        }
        public String GetErrName(){
            return errName;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть код помилки: ");
        int numErr = Integer.parseInt(br.readLine());
        switch (numErr) {
            case 400:
                System.out.println("Код помилки: " + Err.BADREQ.GetErrNumber() +
                        " значення: " + Err.BADREQ.GetErrName());
                break;
            case 401:
                System.out.println("Код помилки: " + Err.UNAUTH.GetErrNumber() +
                        " значення: " + Err.UNAUTH.GetErrName());
                break;
            case 402:
                System.out.println("Код помилки: " + Err.PAYREQ.GetErrNumber() +
                        " значення: " + Err.PAYREQ.GetErrName());
                break;
            default:
                System.out.println("Значення не знайдено");
        }
    }
}
