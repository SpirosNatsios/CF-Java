package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενου επιλογων με do/while
 * η do/while εκτελείται οπωσδήποτε μια φορά
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Please select one of the options below");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("0. Για έξοδο");
            choice = in.nextInt();

        }while(choice != 0);

        System.out.println("Ευχαριστούμε");
    }
}
