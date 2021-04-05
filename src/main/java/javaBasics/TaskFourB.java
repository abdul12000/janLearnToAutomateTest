package javaBasics;

import java.util.Scanner;

public class TaskFourB {
    public static void main(String[] args) {
        //short cut to format your code is ctrl+windowsKEY+Alt+L
       /* Write a java program to take 2 integers (int A and int B) where A = 100 and B = 50.
        Then evaluate the values of A and B, and printout value of A if A is greater than B.
                Otherwise printout value of B.
*/

        //Using Scanner to input numbers

        int A = 100;
        int B = 50;
        System.out.println("Please enter a  value");
        Scanner scanner = new Scanner(System.in);
        String numEntered = scanner.nextLine();
        int convertedInput = Integer.parseInt(numEntered);
        if (convertedInput > B && convertedInput < A) {
            System.out.println("my number is between 51 and 99");
        } else if (convertedInput < B) {
            System.out.println("my number is less than 50");
        } else if (convertedInput > 100) {
            System.out.println("my number is greater than 100");
        } else if (convertedInput == 50) {
            System.out.println("my number is 50");
        } else System.out.println("unknown number");
    }


}
