package javaBasics;

import java.util.Scanner;

public class CCDaysOfTheWeekIfElse {

    public static void main(String[] args) {
        System.out.println("Please enter a number for days of the week:");
        Scanner scanner = new Scanner(System.in);
        String numEntered = scanner.nextLine();
        int convertedInput = Integer.parseInt(numEntered);
//        int dayOfTheWeek = 1;


        if (convertedInput == 1) {
            System.out.println("Monday");
        } else if (convertedInput == 2) {
            System.out.println("Tuesday");
        } else if (convertedInput == 3) {
            System.out.println("Wednesday");
        } else if (convertedInput == 4) {
            System.out.println("Thursday");
        } else if (convertedInput == 5) {
            System.out.println("Friday");
        } else if (convertedInput == 6) {
            System.out.println("Saturday");
        } else if (convertedInput == 7) {
            System.out.println("Sunday");
        } else

            System.out.println("Not a valid number for days of the week");

    }


}

