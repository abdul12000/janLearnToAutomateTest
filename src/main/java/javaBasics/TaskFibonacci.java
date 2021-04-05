package javaBasics;

public class TaskFibonacci {
    //Write a java program that can print out 1, 2, 3, 5, 8, 13, 21, 34, 55.
    //Note that this is a series that follows pattern of n3 = n2 + n1, n4 = n3 + n2, n5 = n4 + n3 ... (Fibonacci series).

    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int n3;
        int count= 15;
        for(int i = 1; i < count; i++ ){
            n3 = n2 + n1;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
