package javaBasics;

import java.util.ArrayList;

public class JavaEigthTutotrial {

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("England");
        countries.add("Poland");
        countries.add("France");
        countries.add("Portugal");

        //traditional way to printout all the list in the array
//        for(int i = 0; i < 4;  i++){
//            System.out.println(countries.get(i));
//        }
        //Using lambda expression
        countries.forEach( (n) -> { System.out.println(n); } );

    }
}
