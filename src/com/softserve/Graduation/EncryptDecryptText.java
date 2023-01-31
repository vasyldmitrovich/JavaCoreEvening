 /*
  * Program for encrypting and decrypting text
  * EncryptDecryptText.class
  * Version 1.0
  * Date 26.01.2023
  * Copyright Roman Sitko
  */

package com.softserve.Graduation;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EncryptDecryptText {

    private static final String EN_LOWER_ALPHABET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    private static final String EN_UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String inputStr;
    private byte key;
    private StringBuilder encText;
    private StringBuilder decText;
    private  List<Character> listEncText;
    private  List<Character> listDecText;

    /*
    * Constructor. Initialization variable
    */
    public EncryptDecryptText() {
        inputStr = "";
        key = 0;
        encText = new StringBuilder();
        decText = new StringBuilder();
        listEncText = new ArrayList<>();
        listDecText = new ArrayList<>();
    }

    /*
    * Method for switching menu
    */
    public void startProgram () {
        System.out.println("Start encrypt-decrypt program. Only ENGLISH text");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte tmpMenu = 0;
        boolean tmpBool = false;
        try {
            do {
                System.out.print("Menu: 1-encrypt , 2-decrypt, 0-exit: ");
                tmpMenu = Byte.parseByte(br.readLine());

                //Another way
/*                if((tmpMenu != 0) || (tmpMenu != 1) || (tmpMenu != 2)) {
                    throw new IOException();
                }
*/

                //Switching beetween items menu
                switch (tmpMenu) {
                    case 1:
                        clearData();
                        if (inputData((byte) 1)) {
                            encryptText();
                        }
                        tmpBool = true;
                        break;
                    case 2:
                        clearData();
                        if (inputData((byte) 2)) {
                            decryptText();
                        }
                        tmpBool = true;
                        break;
                    case 0:
                        clearData();
                        System.out.println("Exit program");
                        tmpBool = false;
                        break;
                    default:
                        System.err.println("Digit should be 1, 2 or 0");
                        tmpBool = true;
                        break;
                }
            } while (tmpBool);
        } catch (IOException e) {
            System.err.println("Digit should be 1, 2 or 0");
        } catch (NumberFormatException e) {
            System.err.println("Digit should be 1, 2 or 0");
        }
    }

    /*
     * Method for clearing variables
     */
    private void clearData() {
        inputStr = "";
        key = 0;
        decText.delete(0, decText.length());
        encText.delete(0, encText.length());
        listEncText.clear();
        listDecText.clear();
    }

    /*
     * Method for input text from console
     */
    public boolean inputData(byte tmp) {
        boolean returnVar = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            if(tmp == 1) {
                System.out.print("Input text for encrypt: ");
                inputStr = br.readLine();
                if (inputStr.length() > 1000) {
                    throw new IllegalArgumentException();
                }
                System.out.print("Input key for encrypt (0-25): ");
                key = Byte.parseByte(br.readLine());
                if ((key < 0) || (key > 25)) {
                    throw new IOException();
                }
                returnVar = true;
            }
            if (tmp == 2) {
                System.out.print("Input text for decrypt: ");
                inputStr = br.readLine();
                if (inputStr.length() > 1000) {
                    throw new IllegalArgumentException();
                }
                System.out.print("Input key for decrypt (0-25): ");
                key = Byte.parseByte(br.readLine());
                if ((key < 0) || (key > 25)) {
                    throw new IOException();
                }
                returnVar = true;
            }
        } catch (IOException e) {
            returnVar = false;
            System.err.println("\nKey should be between 0 and 25");
//            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            returnVar = false;
            System.err.println("\nText should be english alphabet (lower, upper case), digit and punctuation, max length 1000");
        } catch (Exception e) {
            returnVar = false;
            System.err.println("\nError input data");
            e.printStackTrace();
        }
        return returnVar;
    }

    /*
     * Method for encrypt text
     */
    public void encryptText() {
        char[] charsOfLower_Alphabet = EN_LOWER_ALPHABET.toCharArray();
        char[] charsOfUpper_Alphabet = EN_UPPER_ALPHABET.toCharArray();
        char[] charsInputStr = inputStr.toCharArray();
//        private static final String EN_LOWER_ALPHABET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        //Find letters(lower and upper case) and add new letters in accordance a key
        for(int i = 0; i < charsInputStr.length; i++) {
            for(int j = 0; j < 26; j++) {
                if (charsInputStr[i] == charsOfLower_Alphabet[j]) {
                    listEncText.add(charsOfLower_Alphabet[j + key]);
                }
                if (charsInputStr[i] == charsOfUpper_Alphabet[j]) {
                    listEncText.add(charsOfUpper_Alphabet[j + key]);
                }
            }
        }

        //Find non letter element and his position. Add this element to list
        for (int i = 0; i < charsInputStr.length; i++) {
            if(!Character.isLetter(charsInputStr[i])) {
                listEncText.add(i, charsInputStr[i]);
            }
        }

        //Convert list to StrinfBuilder. For best view text.
        for(Character c : listEncText) {
            encText.append(c);
        }

        System.out.println(encText);
    }

    /*
     * Method for decrypt text
     */
    public void decryptText() {
        char[] charsOfLower_Alphabet = EN_LOWER_ALPHABET.toCharArray();
        char[] charsOfUpper_Alphabet = EN_UPPER_ALPHABET.toCharArray();
        char[] charsInputStr = inputStr.toCharArray();

        //Find letters(lower and upper case) and add new letters in accordance a key
        for(int i = 0; i < charsInputStr.length; i++) {
            for(int j = charsOfLower_Alphabet.length - 1; j > 27; j--) {
                if (charsInputStr[i] == charsOfLower_Alphabet[j]) {
                    listDecText.add(charsOfLower_Alphabet[j - key]);
                }
                if (charsInputStr[i] == charsOfUpper_Alphabet[j]) {
                    listDecText.add(charsOfUpper_Alphabet[j - key]);
                }
            }
        }
//        System.out.println("listDecText - " + listDecText.size() + listDecText);
        //Find non letter element and his position. Add this element to list
        for (int i = 0; i < charsInputStr.length; i++) {
            if(!Character.isLetter(charsInputStr[i])) {
                listDecText.add(i, charsInputStr[i]);
            }
        }

        //Convert list to StrinfBuilder. For best view text.
        for(Character c : listDecText) {
            decText.append(c);
        }

        System.out.println(decText);
    }

}