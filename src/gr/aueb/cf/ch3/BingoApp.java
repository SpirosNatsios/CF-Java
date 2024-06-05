package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης μαντέυει ένα μυστικό
 * αριθμό (secret)
 */

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isPlaying = true;


        do{
            System.out.println("Please insert a num");
            num = in.nextInt();

            if(num == SECRET){
                System.out.println("Bingo");
                isPlaying = false;
            } else {
                System.out.println("Try Again");
            }
        }while(isPlaying);

    }
}
