package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μια απλή διαίρεση. Η Διαίρεση με 0
 * απαγορεύεται σοτυς ακεραίους της java
 * δίνει ArithmeticException
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


//        if (denominator == 0){
//            System.out.println("Error. Denominator can not be true");
//            System.exit(1);
//        }



        //Error Conditions
        if (denominator == 0){
            System.out.println("Error. Denominator is zero");
            System.exit(1);
        }
        if (numerator == 0){
            System.out.println("Error. Numerator is zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
