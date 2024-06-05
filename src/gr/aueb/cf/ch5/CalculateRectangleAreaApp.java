package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός
 * παραλληλογράμου
 */

public class CalculateRectangleAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;

        System.out.println("Please insert width");
        width = in.nextDouble();

        System.out.println("Please enter height");
        height = in.nextDouble();

        System.out.printf("The Area of the rectangle is %.2f", calculateArea(width, height));

    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

}
