package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπωνει ενα μενου επιλογων και
 * αναλογα με την επιλογη του χρηστη
 * δινει feedback
 */
public class MenuSwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω (0 για εξοδο)");
            System.out.println("1. One-Player Game");
            System.out.println("2. Two-Player Game");
            System.out.println("3. Team Game");

            choice = in.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Start One-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 0);

        System.out.println("Thank you for playing the game");
    }
}
