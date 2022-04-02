package Class14;

public class CodeTest {


    public static void main(String[] args) {


        /**
         * Q1
         */

        int[] given1 ={32, 54, 12, 67, 2,} ;
        System.out.println(sortArray(given1));


        /**
         * q2
         */

        int sum1 = 323 ;
        System.out.println(sumOfDigit(sum1));


        /**Q4
         *
         */



    }

    public static String sumOfDigit (int intSum){




       String finalSum ="";


        String intSumAsString = String.valueOf(intSum);
        String[] intSumSplit = intSumAsString.split("");

        for (int i=0 ; i < intSumSplit.length ; i++){
            finalSum += intSumSplit[i] ;

        }



        return finalSum ;

    }



    public static int sortArray(int[] inputArr) {
        int outputArr = inputArr[0];
        int lowArr =inputArr[1];

        for (int i = 0; i < inputArr.length; i++) {
            if (lowArr > inputArr[i]) {
                outputArr = inputArr[i];
            }


        }

        return outputArr;
    }


    public static String printCommons (String [] stringInput) {



    }
}