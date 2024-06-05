package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των
 * ψηφίων ενός ακεραίου με do/while
 *
 * Αν ο χρήστης δώσει το 259 τοτε το πλήθος
 * των ψηφίων είναι 3
 */

public class DigitCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigits = 0;
        int rightHandDigit = 0;

        System.out.println("Please insert an int");
        num = in.nextInt();
        copyOfNum = num;

        do{
            count++;

            rightHandDigit = copyOfNum % 10;
            sumOfDigits += rightHandDigit;

            copyOfNum = copyOfNum / 10;
        } while (copyOfNum != 0);

        System.out.printf("%d has %d digits", num, count);
    }
}
