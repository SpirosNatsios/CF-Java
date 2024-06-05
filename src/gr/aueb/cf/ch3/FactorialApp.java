package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το παραγοντικο του n
 * Δηλαδη 1*2*3...*n
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please inster a number to get the factorial");
        n = in.nextInt();

        while ( i <= n ){
            result = result * i;
            i++;
        }

        System.out.printf("Το παραγοντικό του %d είναι %d", n , result);

    }
}
