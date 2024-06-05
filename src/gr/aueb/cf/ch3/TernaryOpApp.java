package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το min με τριαδικο τελεστή
 */
public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two Integers");
        num1 = scanner.nextInt();
        num1 = scanner.nextInt();

//        if(num1 < num2) min = num1;

        min = (num1 < num2) ? num1 : num2;

        System.out.printf("The min of (%d, %d) is %d", num1, num2, min);
    }



}
