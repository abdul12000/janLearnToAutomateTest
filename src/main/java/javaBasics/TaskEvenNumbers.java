package javaBasics;

public class TaskEvenNumbers {
    public static void main(String[] args) {
        //Write a java program that can print out all even numbers between 1 and 11
        for(int j =1; j < 12; j++){
            if(j % 2 == 0){
                System.out.println(j);
            }
        }
    }
}
