package org.fasttrackit.utils;

public  class Helpers {
    // method  for generating new unique email
    public static String generateRandomEmail(){
        return java.util.UUID.randomUUID()+ "@mailinator.com";
    }
}
