package utilities;

import java.util.Random;

public class Utility {

    public static int getRandomNumbers(){
        Random rn = new Random();
        int randonNumbers = rn.nextInt(1000);
        int finalRandom = randonNumbers*100;
        return finalRandom;
    }

    public static String getRandomEmail(){
        Random rn = new Random();
        int randonNumbers = rn.nextInt(1000);
        int finalRandomA = randonNumbers*100;
        String randomEmail = finalRandomA+  "boggy@gmail.com";
        return randomEmail;
    }
    public int getDateForTwoWeeksAhead(){
        int aDate = 3;
        return aDate;
    }

}
