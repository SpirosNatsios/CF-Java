package gr.aueb.cf.ch2;

/**
 * Επιδεικνύει τις μετατροπές μεταξύ
 * διαφορετικώ τύπτων δεδομένων
 */

public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L; // type suffix
        int myResultInt = 0;
        long myResultLong = 0L;

        myInt = (int)myLong; //typecast
        myLong = myInt; // auto widening auto typecast

        myResultInt = myInt + (int)myLong;
        myResultLong = myInt * myLong;
        myResultLong = myInt;



    }
}
