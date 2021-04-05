package javaBasics;

public class TaskMultiples {
    //Write java code to printout 1 to 100. But in the output it should replace the numbers that are
    // multiplesof three with "multiple of three" and replace numbers that are multiples of 5 numbers
    // with "multiple of five" and replace numbers that are multiple of both 3 and 5 with "multiple of three and five

    public static void main(String[] args) {
        for(int i =1; i < 101; i++){
            if(i % 3 == 0 && i %5 !=0) {
                System.out.println("multiple of three");
            }else if(i % 5 ==0 && i %3!= 0){
                System.out.println("multiple of five");
            } else if (i % 3 ==0 && i %5 ==0){
                System.out.println("multiple of three and five");
            }

            else System.out.println(i);
        }
    }
}
