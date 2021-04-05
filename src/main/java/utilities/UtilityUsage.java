package utilities;

public class UtilityUsage {
    private static int finalRandom;
    private static String finalRandomEmail;

    public static int getRandomNum(){
        return  finalRandom;
    }

    public static void setRandomNum(int finalRandom){UtilityUsage.finalRandom= finalRandom;}

    public static String getFinalRandomEmail() {
        return finalRandomEmail;
    }

    public static void setFinalRandomEmail(String finalRandomEmail) {
        UtilityUsage.finalRandomEmail = finalRandomEmail;
    }
}
