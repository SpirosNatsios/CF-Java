package gr.aueb.cf.ch7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next(); // Διαβαζει μεχρι να βρει whitespaces η tab η αλλαγη γραμμης
        s2 = in.nextLine(); // Διαβάζει μέχρι να βρεί /n, το καταναλώνει άλλα δεν το αποδίδει

        System.out.printf("String 1: %s,\n",s1);
        System.out.printf("String2: %s\n", s2);

    }
}
