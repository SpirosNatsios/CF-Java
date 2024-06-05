package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringToAscii {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";

        System.out.println("Please enter a string to encrypt");
        str = in.nextLine();

        System.out.println("The encrypted string is: " + encryptString(str));

    }

    public static String encryptString(String str) {
        char[] stringArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : stringArr) {
            sb.append((int) c + 1);
        }
        return sb.toString();
    }
}