package javaBasics;

public class GGArrays {
    public static void main(String[] args) {
        String[] languages = {"Spanish", "English", "Portuguese", "Russian", "Polish", "Pigin", "Zulu"};

        //printout all the languages using foreach
        for(String i: languages){
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
//printout all the languages using traditional for loop :
        for (int i =0; i < 7; i++){
            System.out.println(languages[i]);
        }
        System.out.println("-------------------------------------");
        //get the length of the array
        System.out.println("The length of the arrays is :" + languages.length);

        System.out.println("-------------------------------------");
        //get languages[0]
        System.out.println("The first array is :" + languages[0]);
        //get languages[6]
        System.out.println("The first array is :" + languages[6]);
        //get languages[7] for out of bound exception
        System.out.println("The first array is :" + languages[7]);
    }
}
