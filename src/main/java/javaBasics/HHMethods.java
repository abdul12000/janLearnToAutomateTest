package javaBasics;

public class HHMethods {

    public Integer MultiplierMethod(){
        int i = 10;
        int j = 20;
        return i * j;
    }
    public Integer MultiplierMethodParam(int k, int p){

        return p * k;
    }
    public Integer SubtractMethod(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        //How to instantiate a class
        HHMethods hhMethods = new HHMethods();
        System.out.println(hhMethods.MultiplierMethod());

        //call the SubtracMethod
        HHMethods hh = new HHMethods();
        System.out.println(hh.SubtractMethod(10,5));



    }
}
