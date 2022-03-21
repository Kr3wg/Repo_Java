package Class7;

import java.util.Locale;

public class Homework5 {

    public static void main(String[] args) {

        /**
         *  A-1
         */

        String countryName = "Kosovo" ;
        countryName = (countryName.toUpperCase(Locale.ROOT)) ;
        System.out.println("The name of my Country is ---> " + countryName);
        String [] splitCountryName = countryName.split("") ;

        for  (int k = 0 ; k < splitCountryName.length ; k++ ){
            System.out.println(splitCountryName[k]);

        }
        System.out.println("Country Name Length is ---> " + splitCountryName.length);


        /**
         *   A-2
         */

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String [] sen2split = sentence2.split(" ") ;
        System.out.println("\nNr of Words Sentence 2 is --> " + sen2split.length);


        /**
         *   A-3
         */

        String sentence3 = "happy birthday to you";
        sentence3 = sentence3.toUpperCase(Locale.ROOT);

        String [] sen3Split = sentence3.split(" ");
        System.out.println("\n" + sen3Split[0]);
        char ch1 = sen3Split[0].charAt(0);
        char ch2 = sen3Split[1].charAt(0);
        char ch3 = sen3Split[2].charAt(0);
        char ch4 = sen3Split[3].charAt(0);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);


        /**
         *   A-4
         */

        int num = 57 ;
        if ( num%5 == 0  ) {
            System.out.println("Divisible By 5 " );
        }else if (num%3 == 0 ){
            System.out.println("Divisible By 3 ");
        }else if (num%5 == 0 && num%3 == 0 ){
            System.out.println("Divisible By 5 and 3 ");
        }else if (num%5 != 0 && num%3 != 0 );{
            System.out.println( "Not Divisible by 5 and 3 ");
        }

        /**
         *   A-5
         *
         *          * 91-100%      -> Grade A
         *          * 81-90.99%    -> Grade B
         *          * 71-80.99%    -> Grade C
         *          * 61-70.99%    -> Grade D
         *          * below 60.99% -> Grade E
         */



        int maxScore = 100;
        if (maxScore > 100 || maxScore < 0 ){
            System.out.println("\nInvalid Max Score Entered");
        }
        int tests = 5;
        double[] studentScore ={ 75 , 87.7 , 90 , 97 , 98.9 } ;




        double totalScore = (studentScore[0]+studentScore[1]+studentScore[2]+studentScore[3]+studentScore[4]);
        double averageScore = totalScore/tests ;
        System.out.println("\nMy Average Score Is --> " + averageScore);

        boolean a =  (averageScore <= 100 && averageScore >= 91) ;
        boolean b =  (averageScore <= 90.99 && averageScore >= 81) ;
        boolean c =  (averageScore <= 80.99 && averageScore >= 71) ;
        if ( a ) {
            System.out.println("Your Grade A");
        }else if ( b ) {
            System.out.println("Your Grade B");
        }else if ( c ) {
            System.out.println("Your Grade C");
        }





    }












    }
