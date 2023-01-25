package com.softserve.MyFinalProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EncryptText {

    private static final String EN_LOWER_ALPHABET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    private static final String EN_UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String inputStr;
    private StringBuilder sb;
    private  List<Character> list;
    private byte key;


    public EncryptText() {
        inputStr = "";
        sb = new StringBuilder();
        list = new ArrayList<>();
        key = 0;
    }

    public void startProgram () {
        System.out.println("Start encrypt-decrypt program");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte tmpByte = 0;
        try {
            boolean tmpBool = false;
            do {
                System.out.print("Menu: 1-encrypt, 2-decrypt, 3-exit: ");
                tmpByte = Byte.parseByte(br.readLine());
//                if((tmpByte < 0) || (tmpByte > 26)) {
//                    throw new IOException();
//                }
                switch (tmpByte) {
                    case 1:
                        inputData();
                        tmpBool = true;
                        break;
                    case 2:
                        System.out.println("22");
                        tmpBool = true;
                        break;
                    case 3:
                        System.out.println("Exit program");
                        tmpBool = false;
                        break;
                    default:
                        System.out.println("default");
                        tmpBool = true;
                        break;
                }
            } while (tmpBool);
        } catch (IOException e) {
            System.out.println("Digit should be 1, 2 or 3");
        }
    }

    public void inputData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input text for encrypt: ");
            inputStr = br.readLine();
            if(inputStr.length() > 100) {
                throw new IOException();
            }
            System.out.print("Input key for encrypt (0-26): ");
            key = Byte.parseByte(br.readLine());
            if((key < 0) || (key > 26)) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("\nKey should be between 0 and 26.");
//            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println("\nText should be english alphabet (lower, upper case), digit and punctuation.");
        } catch (Exception e) {
            System.err.println("Error input data");
            e.printStackTrace();
        }
    }

    public void encryptText() {
        char[] charsOfLower_Alphabet = EN_LOWER_ALPHABET.toCharArray();
        char[] charsOfUpper_Alphabet = EN_UPPER_ALPHABET.toCharArray();
        char[] charsInputStr = inputStr.toCharArray();

        //Find letters(lower and upper case) and add new letters in accordance a key
        for(int i = 0; i < charsInputStr.length; i++) {
            for(int j = 0; j < 26; j++) {
                if (charsInputStr[i] == charsOfLower_Alphabet[j]) {
                    list.add(charsOfLower_Alphabet[j + key]);
                }
                if (charsInputStr[i] == charsOfUpper_Alphabet[j]) {
                    list.add(charsOfUpper_Alphabet[j + key]);
                }
            }
        }

        //Find non letter element and his position. Add this element to list
        for (int i = 0; i < charsInputStr.length; i++) {
            if(!Character.isLetter(charsInputStr[i])) {
                list.add(i, charsInputStr[i]);
            }
        }

        //Convert list to StrinfBuilder. For best view text.
        for(Character c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }

}