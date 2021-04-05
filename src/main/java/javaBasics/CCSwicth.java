package javaBasics;

import java.util.Scanner;

public class CCSwicth {

    public static void main(String[] args) {
        System.out.println("Please enter a number for days of the week:");
        Scanner scanner = new Scanner(System.in);
        String numEntered = scanner.nextLine();
        int convertedInput = Integer.parseInt(numEntered);
//        int dayOfTheWeek = 1;


        switch(convertedInput){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid number for days of the week");

        }


    }
}
