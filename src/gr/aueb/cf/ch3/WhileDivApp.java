package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δυο ακεραίους μέχρι
 * ο αριθμητής να είνια μήδεν
 * Το πρόγραμμα ελέγχει τον παρονομαστή αν είναι
 * 0, και αν είναι 0 δινει τη δυνατότητα στο χρήστη
 * να συνεχίσει δύνοντας παρονομαστή διάφορο του μηδενός
 */

public class WhileDivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int results = 0;

        while(true){
            System.out.println("Please insert two Integers for division");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0){
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0){
                System.out.println("Denominator should not be zero");
                continue;
            }

            results = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, results);
        }

        System.out.println("Thanks for using our App");
    }
}
