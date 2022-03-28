package Class10;

import javax.imageio.stream.ImageInputStream;

public class Homework7 {


    public static void main(String[] args) {

        /**
         *  First Answer.
         */

        String name1 = "happy new year to you dear";
        System.out.println("\nhappy new year to you dear --> " + makeAbbreviation(name1));

        /**
         * Second Answer.
         */


       String firstSen = "HappY nEW YEAR to YoU dEAr" ;

       Homework7 ttC = new Homework7();

       String finalRes = ttC.sentToTitlecase(firstSen);
        System.out.println( "\n" + finalRes);



        /**
         * Third Answer.
         */

        int[] sum1 = {23, 54, 76, 12, 67, 90, 23, 120} ;
        int[] sum2 = {23, 54, 76, 12, 99} ;
        int[] sum3 = {-2, -9, -4, -7, -9, -55, 0} ;

        System.out.println("\nThe Max Value Of Given Int --> " + findMaxInArray(sum1));
        System.out.println("\nThe Max Value Of Given Int --> " + findMaxInArray(sum2));
        System.out.println("\nThe Max Value Of Given Int --> " + findMaxInArray(sum3));


        /**
         * Fourth Answer.
         */

        String word1 = "level" ;
        String word2 = "eye" ;
        String word3 = "fall" ;
        String word4 = "Level" ;
        String word5 = "eYe" ;
        String word6 = "Eye" ;

        Homework7  ccp = new Homework7();


        boolean resPalindrome1 = ccp.checkForPalindrome(word1);
        System.out.println("\nthe given string palindrome-level --> " + resPalindrome1);
        boolean resPalindrome2 = ccp.checkForPalindrome(word2);
        System.out.println("the given string palindrome-eye --> "+resPalindrome2);
        boolean resPalindrome3 = ccp.checkForPalindrome(word3);
        System.out.println("the given string palindrome-fall --> "+resPalindrome3);
        boolean resPalindrome4 = ccp.checkForPalindrome(word4);
        System.out.println("the given string palindrome-Level --> "+resPalindrome4);
        boolean resPalindrome5 = ccp.checkForPalindrome(word5);
        System.out.println("the given string palindrome-eYe --> "+resPalindrome5);
        boolean resPalindrome6 = ccp.checkForPalindrome(word6);
        System.out.println("the given string palindrome-Eye --> "+resPalindrome6);


        /**
         *  Fifth Answer.
         */

        String [] givenStringArr = { "happy", "Happy new year", "peaceful" , "king kong"} ;
        System.out.println("\nThe longest Value in givenStringArr is --> " + findMaxString(givenStringArr));









    }








    public static String makeAbbreviation(String inputStr) {

        String[] nameSplit = inputStr.split(" ");
        String abvRes = "";

        for (int i = 0; i < nameSplit.length; i++) {
            abvRes += nameSplit[i].substring( 0, 1).toUpperCase();
        }
        return abvRes ;
    }




    public String  sentToTitlecase (String stringInput){
        String inputres = "";
        stringInput = stringInput.toLowerCase();
        String [] newWord1 = stringInput.split(" ") ;
        for (int i = 0 ; i < newWord1.length ; i++ ){
            inputres += newWord1[i].substring(0,1).toUpperCase() + newWord1[i].substring(1) + " " ;
        }

        return inputres.trim();
    }






    public static int findMaxInArray (int [] intInput) {

        int maxRes = intInput[0] ;

        for (int i = 0 ; i < intInput.length ; i++ ) {
            if (maxRes < intInput[i]) {
                maxRes = intInput [i] ;
            }
        }
        return maxRes;
    }


    public boolean checkForPalindrome (String checkWords) {

        String revName1 = "" ;

        for (int i = checkWords.length()-1 ; i >= 0 ; i--){
            revName1 += checkWords.charAt(i);
        }
       boolean result = checkWords.equals(revName1);
        return result;
}


    public static String findMaxString (String[] givenString) {

        String resString = givenString[0];
        for ( int i = 0 ; i < givenString.length ; i++ ){
            if(givenString[i].length() > resString.length()){
                resString = givenString[i];
            }
        }
        return resString;
    }
















    }
