package gr.aueb.cf.ch5;

/**
 * Υπολογίζει την ακολουθία fibonacci
 */

public class FibonacciPowApp {

    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * Calculates Fibonacci sequence with reccursion
     *
     * @param n the n-th Fibonacci term.
     * @return the Fibonacci term
     */

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

}
