package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μετατρέπει βαθμούς fahrenheit se celsius
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i+=10){
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, getCelsiusFromFahrenheit(i));
        }
    }

    /**
     * Converts Fahrenheit to Celsius
     * @param fahrenheit
     *          the input Fahrenheit degrees.
     * @return
     *          Celsius degrees after converting from Fahrenheit.
     */
    public static double getCelsiusFromFahrenheit(double fahrenheit){
        return 5 * (fahrenheit - 32) / 9;
    }
}
