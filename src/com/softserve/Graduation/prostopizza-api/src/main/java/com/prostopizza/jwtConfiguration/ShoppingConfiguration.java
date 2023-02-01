package com.prostopizza.jwtConfiguration;

import java.util.HashMap;

public class ShoppingConfiguration {

        public static Boolean validationWithHashMap(String[] keys, HashMap<String,String> request) throws Exception{
            try {
                for (String key : keys) {

                    if (request.containsKey(key)) {//not exist
                        if (request.get(key).equals("")) {//if empty
                            throw new Exception(key + " Should not be empty");
                        }
                    } else {
                        throw new Exception(key + " is missing");
                    }
                }
            }catch(Exception e) {
                e.printStackTrace();
                throw new Exception("Error is "+e.getMessage());
            }
            return false;
        }
}
