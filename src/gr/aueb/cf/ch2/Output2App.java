package gr.aueb.cf.ch2;

/**
 * Template for programming
 * Πολλαπλασιάζει δυο ακεραίους και
 * εκτυπώνει το αποτέλεσμα στην κονσόλα
 */

public class Output2App {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 500;
        int totalPrice = 0;

        //Εντολές
        totalPrice = price * quantity;

        //Εκτύπωση αποτελεσμάτων

        System.out.printf("Quantity: %3d, Price: %d, Total Price: %,d\n", quantity, price, totalPrice);

    }
}