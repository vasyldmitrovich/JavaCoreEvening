package com.softserve.edu13.homeWork.StringCryptic;

import com.softserve.edu13.homeWork.StringCryptic.StringCryptic;

public class AppStringCryptic {
    public static void main(String[] args) throws UnexpectedEnterException {
        StringCryptDecrypt string1 = new StringCryptDecrypt();
        StringCryptic encrypt = (s, n) -> {
            String ReplaceString = "";
            for (int i = 0; i<s.length(); i++){
                try{
                char ch = s.charAt(i);
                if(ch>122 || ch<65){
                    throw new UnexpectedEnterException();
                }else{
                    char newChar;
                    if (ch == 'z'){
                        newChar = (char) (65+n-1);
                    } else {
                        newChar = (char) (ch + n);
                    }
                    ReplaceString += newChar;
                }
                }catch (UnexpectedEnterException e){
                    e.getMessage();
                }

            }
            return ReplaceString;
        };

        string1.encrypt(encrypt);

        StringCryptic decrypt = (s, n) -> {
            String ReplaceString = "";
            for (int i = 0; i<s.length(); i++){
                try{
                    char ch = s.charAt(i);
                    if(ch>122 || ch<65){
                        throw new UnexpectedEnterException();
                    }else{
                char newChar;
                if (ch == 'A'){
                    newChar = (char) (122-n+1);
                } else {
                    newChar = (char) (ch - n);
                }
                ReplaceString += newChar;
                }
            }
                catch (UnexpectedEnterException e){
                    e.getMessage();
                }
            }
            return ReplaceString;
        };

        string1.decrypt(decrypt);
    }
}
