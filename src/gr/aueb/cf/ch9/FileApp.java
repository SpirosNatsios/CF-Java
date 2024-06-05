package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("C/tmp/file6.txt");
        String line;
        String [] tokens;

        try (Scanner in = new Scanner(fd)){

            while (in.hasNext()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens ){
                    System.out.println(token + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("naaaaah");
        }
    }
}
