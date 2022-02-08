package org.fasttrackit.utils;

public  class Helpers {
    // method  for generating new unique email
    public static String generateRandomEmail(){
        return java.util.UUID.randomUUID()+ "@mailinator.com";
    }
    public static void waitFor(long duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
