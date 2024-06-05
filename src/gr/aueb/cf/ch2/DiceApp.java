package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DiceApp {

    public static void main(String[] args) {

        int die1 = (int) (Math.random() * 6);
        int die2 = (int) (Math.random() * 6);

        System.out.printf("%d, %d", die1, die2);


    }



}
